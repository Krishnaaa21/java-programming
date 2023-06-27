import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    boolean isPrime = true;
    if (number < 2) {
      isPrime = false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is not a prime number.");
    }
  }
}
