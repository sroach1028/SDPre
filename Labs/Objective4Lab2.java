import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args){
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    if(string1.equals(string2)){
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }

    if(string1.equals(string3)){
      System.out.println(string1 + " is equivalent to " + string3);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string3);
    }
  }
}
