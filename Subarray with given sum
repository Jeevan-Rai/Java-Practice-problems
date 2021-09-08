package myprog;

import java.util.Scanner;

public class subarrayofsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the required sum : ");
        int s = sc.nextInt();
        int sum = 0;
        int i=0,j=0;
            for (i = 0; i < n; i++) {
                sum = a[i];
                for (j = i+1; j < n; j++) {
                    sum = sum + a[j];
                    if(sum == s)
                    {
                        System.out.println((i+1)+" to "+(j+1));
                    }
                }
            }
    }
}
