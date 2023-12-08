package Appu;
import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = new String[str.length()];
        int top = -1;
        boolean flag = false;

        // for loop to insert all open brackets to the array
        for(int i=0; i<str.length(); i++)
        {
            char symb = str.charAt(i);
            String symbol = String.valueOf(symb);
            if (symbol.equals("(") || symbol.equals("[") || symbol.equals("{") || symbol.equals("<")) {
                top += 1;
                arr[top] = symbol;
            }
        }
        
        // chack if brackets are matching
        for(int i=0; i<str.length(); i++)
        {
            char symb = str.charAt(i);
            String symbol = String.valueOf(symb);
            
            if (symbol.equals(")")) {
                String temp = arr[top];
                System.out.println("TBR: 1 " + temp + " " + symbol);
                if (temp.equals("(")) {
                    top -= 1;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            
            else if (symbol.equals("]")) {
                String temp = arr[top];
                System.out.println("TBR: 1 " + temp + " " + symbol);
                if (temp.equals("[")) {
                    top -= 1;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            
            else if (symbol.equals("}")) {
                String temp = arr[top];
                System.out.println("TBR: 1 " + temp + " " + symbol);
                if (temp.equals("{")) {
                    top -= 1;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            
            else if (symbol.equals(">")) {
                String temp = arr[top];
                System.out.println("TBR: 1 " + temp + " " + symbol);
                if (temp.equals("<")) {
                    top -= 1;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        

        // print the statement accordingly
        if (flag && top==-1) {
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
