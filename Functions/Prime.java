import java.util.Scanner;

public class Prime{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int x = sc.nextInt();
    System.out.println(isPrime(x));
    System.out.println(fact(x));

  }

  public static boolean isPrime(int n){
    if(n<2)
    return false;
    for(int i=2; i<n; i++){
      if(n%i==0)
      return false;
    }
    return true;
  }

  public static int fact(int n){
    int ans = 1;
    for(int i=n;i>=1; i--){
      ans *=i;
    }
    return ans;
  }
  
}
