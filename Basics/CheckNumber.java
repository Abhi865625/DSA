import java.util.Scanner;

public class CheckNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");

    int num = sc.nextInt();

    if(num>0){
      System.out.println("Positive number");
    }else if(num==0){
      System.out.println("Number is zero");
    }else{
      System.out.println("Number is negative");
    }
  }
}
