import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Enter power: ");
    int pow = sc.nextInt();
    int ans = n;

    for(int i=1; i<pow;i++){
      ans *= n;
    }
    System.out.println(n+"^"+ pow+" = "+ans);

   
  }
}
