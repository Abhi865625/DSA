public class AlphabetPattern2 {
  public static void main(String[] args) {
    int n = 5;

    // char ch ='A';
    for(int row =1; row<=n; row++){
      // Space
      for(int col = 1; col<=n-row; col++){
        System.out.print("  ");
      }
      for(char ch = 'A'; ch<='A'+row-1; ch++){
        System.out.print(ch+" ");
      } 
      
      System.out.println();
    }
  }
}
