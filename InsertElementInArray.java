public class InsertElementInArray {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Element to be inserted
        int elementToInsert = 6;

        // Location where you want to insert the element (0-based index)
        int insertIndex = 2;

        // Create a new array with increased size
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements from the original array to the new array up to the insert index
        for (int i = 0; i < insertIndex; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert the new element at the specified location
        newArray[insertIndex] = elementToInsert;

        // Copy the remaining elements from the original array to the new array
        for (int i = insertIndex + 1; i < newArray.length; i++) {
            newArray[i] = originalArray[i - 1];
        }

        // Print the modified array
        System.out.print("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Element to Insert: " + elementToInsert);
        System.out.println("Insert Index: " + insertIndex);

        System.out.print("Modified Array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}