import java.util.Scanner;

public class AllEvenNumber {
  public static void main(String[] args) {

    oddNum();
    evenNum();


  }

  static void oddNum(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    for(int i = 1; i<=num; i+=2){
      System.out.println(i);
    }

  }

  static void evenNum(){
      Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    for(int i = 2; i<=num; i+=2){
      System.out.println(i);
    }

    
  }
  
}
