public class DecimalToBinary {
  public static void main(String[] args) {
    int n = 73;
    int rem, ans = 0, mul = 1;

    while (n > 0) {
      // reminder
      rem = n % 2;
      // quotient
      n /= 2;
      // ans
      ans += rem * mul;
      // mul
      mul *= 10;
    }
    System.out.println("Binary: " + ans);

  }

}
