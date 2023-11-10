import java.util.Scanner;

public class NumberPattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    for(int row=1; row<=n; row++){
      // Space Print
      for(int col = 1; col<=n-row; col++){
        System.out.print("  ");
      }
      for(int col=1; col<=row;col++){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
}
