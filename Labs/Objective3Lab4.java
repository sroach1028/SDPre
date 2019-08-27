import java.util.Scanner;

public class Objective3Lab4{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
     String firstName, lastName;
     int age;

     System.out.print("What is your first name?: ");
     firstName = input.next();
     System.out.print("What is your last name?: ");
     lastName = input.next();
     System.out.print("How old are you?: ");
     age = input.nextInt();

     System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);
  }
}
