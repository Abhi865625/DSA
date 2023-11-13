public class BinaryToDecimal {
  public static void main(String[] args) {
    int n = 11;
  int rem, ans = 0, mul = 1;

  while(n>0)
  {
    // reminder
    rem = n % 10;
    // quotient
    n /= 10;
    // ans
    ans += rem * mul;
    // mul
    mul *= 2;
  }System.out.println("Decimal: "+ans);

  }
  
}
