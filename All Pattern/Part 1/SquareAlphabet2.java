public class SquareAlphabet2 {
  public static void main(String[] args) {
    int n=5;
    
    for(int row =1; row<=5; row++){
      char ch = 'a';
      for(int col =1; col<=n; col++){
        System.out.print(ch+ " ");
        ch++;
      }
      
      System.out.println();
    }

    // OR
    for(int row =1; row<=5; row++){
      for(char ch ='a'; ch<='e'; ch++){
        System.out.print(ch+ " ");
      }
      
      System.out.println();
    }
  }
  
}
