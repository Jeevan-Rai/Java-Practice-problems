public class SpringBootExample {
    
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
    }
}


class Example {
    int x;
    int y;

    public void display()
    {
        System.out.println(x + " " + y);
    }
}