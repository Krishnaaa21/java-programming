import java.util.*;

public class main{
    
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        int sub =a-b;
        int mul= a*b;
        int div= a/b;
        System.out.println("Sum of two numbers is:"+sum);
        System.out.println("Substraction of two numbers is:"+sub);
        System.out.println("Multiply of two numbers is:"+mul);
        System.out.println("Division of two numbers is:"+div);
   }
}
