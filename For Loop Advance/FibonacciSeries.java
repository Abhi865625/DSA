import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms in the Fibonacci series: ");
    int n = sc.nextInt();
    int first = 0;
    int second = 1;
    if(n==0){
      System.out.println(first);
    }else if(n==1){
      System.out.println(second);
    }else{
      for(int i=2; i<=n; i++){
        int next = first + second;
        first = second;
        second = next;
      }
      System.out.println(second);
    }
  
  }
}
