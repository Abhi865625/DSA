public class SquareReverse {
  public static void main(String[] args) {
    int n = 5;
    for(int row = 1; row<=n;row++){
      for(int col = n; col>=1; col--){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
}
