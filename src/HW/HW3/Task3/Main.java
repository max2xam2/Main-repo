package HW.HW3.Task3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    User userFirst = new User("Maks", 23);
    System.out.println(User.getCountCreatedUsers());

    User userSecond = new User("Igorek", 87);
    System.out.println(User.getCountCreatedUsers());

  }
}
