import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = input.nextDouble();
    double pi = 3.14159;
    double area = pi * radius * radius;
    double circ= pi* 2* radius;
    System.out.println("The area of the circle is " + area);
    System.out.println("The circumference of the circle is " + circ);
  }
}
