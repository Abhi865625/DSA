import java.util.Scanner;

public class NaturalNoSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();


    // int sum = 0;
    // for(int i=1; i<=n; i++){
    //   sum +=i;
    // }
    // System.out.println("Sum of "+n+" natural number is: "+sum);



    // OR
    // sum = (n*(n+1))/2;
    // System.out.println(sum);

    // Sum of square of n natural number

    int sum = 1;
    for(int i=2;i<=n;i++){
      sum += i*i;
    }
    System.out.println("Sum of Square of "+n+" natural number is: "+sum);


     // OR
    sum = (n*(n+1)*(2*n+1))/6;
    System.out.println(sum);

  }
 
}
