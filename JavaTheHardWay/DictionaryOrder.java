import java.util.Scanner;

public class DictionaryOrder {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name;

    System.out.print( "Make up the name of a programming language! ");
    name = input.nextLine();

    if ( name. compareTo("c++") < 0)
      System.out.println(name + " comes BEFORE c++");
    if ( name.compareTo("c++") == 0)
      System.out.println(name + " c++ isn't a made-up language!");
    if (name.compareTo("c++") > 0)
      System.out.println(name + " comes AFTER c++");

    if ( name. compareTo("go") < 0)
      System.out.println(name + " comes BEFORE go");
    if ( name.compareTo("go") == 0)
      System.out.println(name + " go isn't a made-up language!");
    if (name.compareTo("go") > 0)
      System.out.println(name + " comes AFTER go");

    if ( name. compareTo("java") < 0)
      System.out.println(name + " comes BEFORE java");
    if ( name.compareTo("java") == 0)
      System.out.println(name + " java isn't a made-up language!");
    if (name.compareTo("java") > 0)
      System.out.println(name + " comes AFTER java");

    if ( name. compareTo("lisp") < 0)
      System.out.println(name + " comes BEFORE lisp");
    if ( name.compareTo("lisp") == 0)
      System.out.println(name + " lisp isn't a made-up language!");
    if (name.compareTo("lisp") > 0)
      System.out.println(name + " comes AFTER lisp");

    if ( name. compareTo("python") < 0)
      System.out.println(name + " comes BEFORE python");
    if ( name.compareTo("python") == 0)
      System.out.println(name + " python isn't a made-up language!");
    if (name.compareTo("python") > 0)
      System.out.println(name + " comes AFTER python");

    if ( name. compareTo("ruby") < 0)
      System.out.println(name + " comes BEFORE ruby");
    if ( name.compareTo("ruby") == 0)
      System.out.println(name + " ruby isn't a made-up language!");
    if (name.compareTo("ruby") > 0)
      System.out.println(name + " comes AFTER ruby");

    if ( name. compareTo("visualbasic") < 0)
      System.out.println(name + " comes BEFORE visualbasic");
    if ( name.compareTo("visualbasic") == 0)
      System.out.println(name + " visualbasic isn't a made-up language!");
    if (name.compareTo("visualbasic") > 0)
      System.out.println(name + " comes AFTER visualbasic");
 
  }
}
