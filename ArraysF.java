import java.util.Arrays;

public class ArraysF {
  public static void main(String[] args) {
    // char vowels[] = new char[5];
    // vowels[0] = 'a';
    // vowels[1] = 'e';
    // vowels[2] = 'i';
    // vowels[3] = 'o';
    // vowels[4] = 'u';

    char vowels[] = { 'a', 'e', 'o', 'i', 'u' };

    Arrays.sort(vowels);

    System.out.println(Arrays.toString(vowels));
  }
}
