public class NimGame {
  public static void main(String[] args) {
     System.out.println(canWinNim(27));
    
  }

  public static boolean canWinNim(int n) {
    if(n%4 !=0)
        return true;
    else
        return false;
}
}
