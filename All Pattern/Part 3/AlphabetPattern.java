public class AlphabetPattern {
  public static void main(String[] args) {
    int n = 5;

    char ch ='A';


    for(int row =1; row<=n; row++){
      // Space
      for(int col = 1; col<=n-row; col++){
        System.out.print("  ");
      }
      for(int col = 1; col<=row; col++){
        System.out.print(ch+" ");
      }
      ch++;
      System.out.println();
    }

    
  }
}
