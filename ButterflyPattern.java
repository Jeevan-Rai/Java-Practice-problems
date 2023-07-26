import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number for the rows.");
            return;
        }
        
        printButterflyPattern(rows);
    }
    
    public static void printButterflyPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Spaces between triangles
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            // Right triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        for (int i = rows; i >= 1; i--) {
            // Left triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Spaces between triangles
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            // Right triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
