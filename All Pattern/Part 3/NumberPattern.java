import java.util.Scanner;

public class NumberPattern {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    for(int row = 1; row<=n; row++){
      // Space Print
      for(int col = 1; col<=n-row; col++){
        System.out.print("  ");
      }
      // Star Print
      for(int col = 1; col<=row; col++){
          System.out.print(row+" ");
        }
      System.out.println();
    }
  }
}
