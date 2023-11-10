public class AlphabetPattern {
  public static void main(String[] args) {
    int n =5;
    char ch = 'a';
    // for(int row=1; row<=n; row++){
    //   for(int col=1;col<=row; col++){
    //     System.out.print(ch+" ");
    //   }
    //   ch++;
    //   System.out.println();
    // }

    for(int row=1; row<=n; row++){
      for(int col=1;col<=row; col++){
        System.out.print(ch+" ");
        ch++;
      }
      
      System.out.println();
    }
    

    
    // for(int row=1; row<=n; row++){
    //   char ch = 'a';
    //   for(int col=1;col<=row; col++){
    //     System.out.print(ch+" ");
    //     ch++;
    //   }
      
    //   System.out.println();
    // }
    
  }
}
