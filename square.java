import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the side of a square: ");
    int a = input.nextInt();
    
    int area = a*a;
    int pare= 4*a;
    System.out.println("The area of the square is " + area);
    System.out.println("The paremeter of the square is " + pare);
  }
}
