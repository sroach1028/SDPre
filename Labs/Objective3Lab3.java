import java.util.Scanner;

public class Objective3Lab3 {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int birthYear;
    int age;
    int currentYear = 2019;

    System.out.println("How old are you?");
    age = input.nextInt();
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
