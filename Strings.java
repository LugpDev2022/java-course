public class Strings {
  public static void main(String[] args) {

    //
    String name = "Luis";
    String country = "Mexico";
    int age = 16;

    String message = String.format("My name is %s. I am from %s. I am %d years od", name, country, age);

    System.out.println(message);
  }
}
