public class NumberPatternx {
  public static void main(String[] args) {
    int n = 5;
    for(int row =1; row<=n; row++){
      // Space
      for(int col = 1; col<=n-row; col++){
        System.out.print("  ");
      }
      for(int col = row; col<=row; col--){
        System.out.print(row+" ");
      } 
      
      System.out.println();
    }

  }
}
