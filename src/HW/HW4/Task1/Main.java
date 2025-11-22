package HW.HW4.Task1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    String newName = input.nextLine();
    int newAge = input.nextInt();
    Human human = new Human(newName);
    human.setAge(newAge);
  }
}
