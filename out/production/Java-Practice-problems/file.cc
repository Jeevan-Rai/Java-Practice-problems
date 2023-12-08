#include "HashTable.h"
#include "tinyxml2.h"

int main()
{
    // Create a HashTable instance
    HashTable<const char *, MAX_KEY_SIZE, const char *, std::equal_to<const char *>, KeyHash> xmlDataMap(100);

    // Static XML input (replace this with your XML data)
    const char *xmlString =
        "<root>"
        "    <Name>John</Name>"
        "    <Age>30</Age>"
        "    <City>New York</City>"
        "</root>";

    // Load and parse the static XML string
    tinyxml2::XMLDocument xmlDoc;
    if (xmlDoc.Parse(xmlString) != tinyxml2::XML_SUCCESS)
    {
        std::cerr << "Error parsing XML string." << std::endl;
        return 1;
    }

    // Traverse the XML tree and populate the HashTable
    tinyxml2::XMLElement *root = xmlDoc.FirstChildElement();
    if (!root)
    {
        std::cerr << "XML string is empty." << std::endl;
        return 1;
    }

    for (tinyxml2::XMLElement *element = root->FirstChildElement(); element; element = element->NextSiblingElement())
    {
        const char *tagName = element->Name();
        const char *tagValue = element->GetText();
        if (tagName && tagValue)
        {
            xmlDataMap.Insert(tagName, tagValue);
        }
    }

    // Example: Retrieve values from the HashTable
    const char *name = "Name";
    const char *age = "Age";

    const char *nameValue = xmlDataMap.Get(name);
    const char *ageValue = xmlDataMap.Get(age);

    if (nameValue)
    {
        std::cout << "Name: " << nameValue << std::endl;
    }
    if (ageValue)
    {
        std::cout << "Age: " << ageValue << std::endl;
    }

    return 0;
}