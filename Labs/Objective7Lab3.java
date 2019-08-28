import java.util.Scanner;

public class Objective7Lab3 {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int selection;

    while (true){
      printMenu();
      selection = input.nextInt();

      if (selection == 1)
        System.out.println("Hello World");
      else if (selection == 2)
        System.out.println("Apple, Banana, Coconut");
      else if (selection == 3)
        break;
      else
      System.out.println("Invalid Response. Select \"1\", \"2\", or \"3\"");
    }
  }

  public static void printMenu() {
    System.out.println("_______Menu_______");
    System.out.println("1. Say Hello");
    System.out.println("2. List my favorite foods");
    System.out.println("3. Exit");
    System.out.println();
  }
}
