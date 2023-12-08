package Appu;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int n = scanner.nextInt();
        int ans = findFact(n);
        System.out.println("Factorial is:" + ans);
    }

    public static int findFact(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else {
            return n*findFact(n-1);
        }
    }
}