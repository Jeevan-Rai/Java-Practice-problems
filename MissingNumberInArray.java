public class MissingNumberInArray {
    public static void main(String[] args) {
        // Input array with one missing number
        int[] arr = {1, 2, 4, 6, 3, 7, 8};

        // Calculate the sum of all numbers in the input array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Calculate the expected sum of all numbers in a complete sequence
        int n = arr.length + 1; // Adding 1 for the missing number
        int expectedSum = (n * (n + 1)) / 2;

        // Find the missing number
        int missingNumber = expectedSum - sum;

        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}