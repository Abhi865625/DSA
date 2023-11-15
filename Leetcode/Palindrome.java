public class Palindrome {
  public static void main(String[] args) {
    int x = -121;
    int rem, ans = 0;
    int num = x;

    if (x < 0)
      System.out.println("Not a Palindrome number");
    else {

      while (x > 0) {
        rem = x % 10;
        x /= 10;
        ans = ans * 10 + rem;
      }
      if (ans == num) {
        System.out.println("Palindrome number");
      } else {
        System.out.println("Not a Palindrome number");
      }
    }
  }
}
