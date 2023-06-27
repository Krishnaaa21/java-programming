import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the side of a cube: ");
    int a = input.nextInt();
    
    int volume = a*a*a;
    int pare= 12*a;
    System.out.println("The volume of the square is " + volume);
    System.out.println("The paremeter of the square is " + pare);
  }
}
