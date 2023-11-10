public class SquareAlphabet3 {
  public static void main(String[] args) {
    int n=5;
    char ch = 'a';
    
    for(int row =1; row<=5; row++){
      for(int col =1; col<=n; col++){
        System.out.print(ch+ " ");
        ch++;
      }
      
      System.out.println();
    }

    
  }
  
}
