import java.util.Scanner;

public class CoinFlip {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do{
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flip a coin and it is... " + coin);

      if (gotHeads) {
        streak++;
        System.out.println("\tThat's " + streak + " in a row....");
        System.out.print("Would you like to flip again? ");
        again = input.next();
      }
      else {
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD....");
        streak = 0;
        again = "n";
      }
    } while ( again.equals("y"));  
  }
}
