package HW.HW3.Task3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    User userFirst = new User("Maks");

    System.out.println(User.getCountCreatedUsers());

    User userSecond = new User("Igorek");
    System.out.println(User.getCountCreatedUsers());

  }
}
