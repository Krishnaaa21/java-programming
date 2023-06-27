import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the sides of the rectangle: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int area = a*b;
    int pare= 2*(a+b);
    System.out.println("The area of the rectangle is " + area);
    System.out.println("The paremeter of the rectangle is " + pare);
  }
}
