public class PowerOf2 {
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(63));
  }

  public static boolean isPowerOfTwo(int n) {
    if (n < 1)
      return false;

    while (n != 1) {
      if (n % 2 == 1)
        return false;
      n /= 2;
    }
    return true;
  }
}
