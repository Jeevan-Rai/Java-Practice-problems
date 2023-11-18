import java.util.Scanner;

public class SubstringExample {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();

        // Loop through the string to generate substrings
        System.out.println("Substrings of the given string are:");

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                // Extract the substring from index i to j manually
                for (int k = i; k < j; k++) {
                    System.out.print(inputString.charAt(k));
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}