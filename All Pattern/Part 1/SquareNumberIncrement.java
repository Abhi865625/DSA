public class SquareNumberIncrement {
  public static void main(String[] args) {
    int n = 5;
    int count=1;
    
    for(int row = 1; row<=n; row++){
      for(int col=1;col<=n;col++){
        System.out.print(count+" ");
        count++;
      }
      System.out.println();
    }
    }
}
