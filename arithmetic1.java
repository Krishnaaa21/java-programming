import java.util.*;

public class main{
    
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two float numbers a and b");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum =a+b;
        float sub =a-b;
        float mul= a*b;
        float div= a/b;
        System.out.println("Sum of two numbers is:"+sum);
        System.out.println("Substraction of two numbers is:"+sub);
        System.out.println("Multiply of two numbers is:"+mul);
        System.out.println("Division of two numbers is:"+div);
   }
} 
