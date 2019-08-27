import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.print("Please enter a number: ");
    userNum = scanner.nextInt();
    if (userNum > 0){
      System.out.println("The number is positive");
    }
    else if (userNum == 0){
      System.out.println("The number is neither positive or negative");
    }
    else {
      System.out.println("The number is negative");
    }
  }
}
