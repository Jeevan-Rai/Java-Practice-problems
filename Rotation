package myprog;

import java.util.Scanner;

public class rotation {
    public  static int[] rotateonce(int[] arr)
    {
        int l = arr.length;
        int temp = arr[l-1];
        for(int i=l-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("enter the test cases : ");
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int c = 1;
        while(c<=t) {
            System.out.println("test case : "+c);
            System.out.println("enter the number of elements and required number of rotations");
            int n = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++)
            {
                arr[i] =i+1;
            }
            for(int i = 1; i<=r; i++)
            {
                arr = rotateonce(arr);
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            c++;
        }

    }
}
