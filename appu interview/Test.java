import java.util.*;

public class Test {
    public static void main(String[] args) {
        // String[] arr = { "hii", "hello", "namaste" };
        // System.out.println("[ " + arr[0] + ", " + arr[1] + ", " + arr[2] + " ]");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ", ");
        // }
        // System.out.println();
        // Scanner scanner = new Scanner(System.in);
        // String name;
        // name = scanner.nextLine();
        // System.out.println(name);
        // String[] arr1 = new String[5];
        // System.out.println("enter the input");
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = scanner.nextLine();
        // }
        // System.out.println("The array elements are");
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + ", ");
        // }

    //     System.out.println(fact(5));

    }

    // public static int fact(int n)
    //     {
    //         if(n == 0 || n ==1)
    //         {
    //             return 1;
    //         }
    //         else {
    //             return n * fact(n - 1);
    //         }
    //     }
}

class CarOfIndia {
    String Seating;

    CarOfIndia()
    {
        this.Seating = "4";   
    }

    public void display() {
        
    }
}

class Toyota extends CarOfIndia {
    public final String m1 = "data";
    public String m2;
    public String m3;
    public static final String str = "I am String";

    public static void display1() {
        System.out.println("Iam Toyota");
    }
}

class Tata extends CarOfIndia {
    Toyota obj = new Toyota();
    @Override
    public void display() {
        System.out.println("Iam Tata");
    }
}


class Add {
    public void result(int a, int b)
    {

    }

    // private int result(int a, int b) {
    //     return a+b;
    // }

    public void result(int a, int b, int c)
    {

    }

    public void result(float a, int b) 
    {
        
    }
}
