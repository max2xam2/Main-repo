package HW.HW3.Task1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();
    double width = input.nextDouble();;
    double height = input.nextDouble();
    Circle circle = new Circle(r);
    Rectangle rectangle = new Rectangle(width, height);
    System.out.println(Shape.calculatePerimeter(circle, rectangle));
  }
}
