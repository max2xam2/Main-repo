package HW.HW3.Task4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Circle circle = new Circle(10);
    circle.draw();
    circle.displayInfo();
  }
}
