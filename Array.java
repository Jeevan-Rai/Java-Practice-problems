public class Array {

    static void printPairs(int arr[], int n, int sum) {

        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (arr[i] + arr[j] == sum)
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");

    }

    public static void main(String[] arg) {
        int arr[] = { 2, 4, 7, 5, 9, 10 };
        int n = arr.length;
        int sum = 14;
        printPairs(arr, n, sum);
    }

}