// https://jamboard.google.com/d/1Cvtyvn4QiMmAU3Cc2732PhOsl10VgZOoO7q90SIo6Xo/viewer?mtt=6m4owt9wocw3&f=0
import java.util.Scanner;

public class DiagonalSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int col = 0;
        while (true) {
            System.out.println("row:" + row + " col:" + col);

            if (!(row == 0 && col == 0) && !(row == arr.length - 1 && col == arr.length - 1)) {
                int holdrow = row;
                int holdcol = col;
                int itrrow = row - 1;
                int itrcol = col + 1;

                while ((holdrow > 0 && holdcol < arr.length - 1)) {
                    System.out.println("holdRow:" + holdrow + " holdCol:" + holdcol);
                    System.out.println("arr[holdrow][holdcol]: " + arr[holdrow][holdcol]);
                    System.out.println("arr[itrrow][itrcol]: " + arr[itrrow][itrcol]);

                    if (arr[holdrow][holdcol] > arr[itrrow][itrcol]) {
                        int temp = arr[holdrow][holdcol];
                        arr[holdrow][holdcol] = arr[itrrow][itrcol];
                        arr[itrrow][itrcol] = temp;
                        System.out.println("swaped");
                    }

                    if (itrrow == col && itrcol == row) {
                        holdrow--;
                        holdcol++;
                        itrrow = holdrow - 1;
                        itrcol = holdcol + 1;

                    }

                    else if (itrrow > 0 && itrcol < arr.length - 1) {
                        itrrow--;
                        itrcol++;
                    }

                }

            }

            if (row == arr.length - 1 && col == arr.length - 1) {
                System.out.println("break");
                break;
            }

            if (row == arr.length - 1) {
                System.out.println("col++");
                col++;
            }

            if (row < arr.length - 1) {
                System.out.println("row++");
                row++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("done");

        sc.close();
    }
}
