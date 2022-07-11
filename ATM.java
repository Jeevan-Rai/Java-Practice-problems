import java.util.Scanner;


class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
double x = sc.nextDouble();
double y = sc.nextDouble();

if(((x>0) && (x<=2000))&&((y>0) && (y<=2000))){
   if(x%5.0==0 && x<y){
       y=y-x;
       y=y-0.5;
       System.out.println(y);
   }
else{
   System.out.println(y);
}
}
}
}
