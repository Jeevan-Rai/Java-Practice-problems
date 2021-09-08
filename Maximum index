package myprog;

import java.util.Scanner;

public class maximum_of_index {
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
        System.out.println("Maximum value is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j++)
            {
                while(i<j)
                {
                    if(a[i]>a[j])
                    {
                        System.out.println(j-i);
                        return;
                    }
                    else
                    {
                        System.out.println("Failed!!");
                        return;
                    }
                }
            }
        }
    }
}
