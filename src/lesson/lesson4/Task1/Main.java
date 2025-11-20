package lesson.lesson4.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    /*Важная штучка обязательно повторить*/

    try(Scanner input = new Scanner(new File("/Users/maksimoskin/IdeaProjects/Main-repo/src/lesson/lesson4/Task1/task1.txt")))
    {
      input.nextLine();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
    Calculator calculator = new Calculator();
    try {
      calculator.add(100, 18);
    } catch (NegativeExceprion e) {
      e.printStackTrace();
    }
  }
}