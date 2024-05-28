import java.util.Scanner;

public class UserInputs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");

    String name = scanner.nextLine();

    System.out.printf("Hello %s. How old are you? \n", name);

    int age = scanner.nextInt();
    System.out.printf("%d is an excellent age to start programming. What language do you prefer? \n", age);

    // clans up the input buffer
    scanner.nextLine();

    String language = scanner.nextLine();
    System.out.printf("%s is my favorite!", language);

    scanner.close();
  }
}
