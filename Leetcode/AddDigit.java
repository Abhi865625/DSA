import java.util.Scanner;

public class AddDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    
    while (num > 9) {
      int sum = 0, rem;
      while (num > 0) {
        rem = num % 10;
        num /= 10;
        sum += rem;
      }
      num = sum;
    }
    System.out.println(num);

  }
}
