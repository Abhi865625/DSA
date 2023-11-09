import java.util.Scanner;

public class PrimeNotPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    if(n<2){
      System.out.println("Not a Prime number");
    }else{
      for(int i=2;i<n;i++){
        if(n%i==0){
          System.out.println("Not a Prime number");
          break;
        }else{
        System.out.println("Prime number");
        break;
      }
      }
    }
  }
}
