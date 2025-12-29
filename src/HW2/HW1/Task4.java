package HW2.HW1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    input.nextLine();
    Set<String> symbol = new HashSet<>();
    for (int i = 0; i < count; i++) {
      String line = input.nextLine();
      String[] words = line.split(" ");
      for (String word : words) {
        symbol.add(word);
      }
    }

    System.out.println(symbol.size());

    input.close();
  }
}
