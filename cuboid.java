import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the sides of a cuboid: ");
    int l = input.nextInt();
    int b = input.nextInt();
    int h = input.nextInt();
    
    int volume = l*b*h;
    
    System.out.println("The volume of the square is " + volume);
  }
}
