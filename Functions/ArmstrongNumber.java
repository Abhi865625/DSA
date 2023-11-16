import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");

    int x = sc.nextInt();
    armstrongNo(x);

  }

  static void armstrongNo(int x) {
    int num = x;
    int rem, sum = 0;
    while (x > 0) {

      rem = x % 10;
      x /= 10;
      sum += rem * rem * rem;

    }

    if (sum == num) {
      System.out.println("Armstrong number ");
    } else {
      System.out.println("Not a Armstrong number ");
    }

  }
}
