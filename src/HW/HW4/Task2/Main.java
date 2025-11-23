package HW.HW4.Task2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double numberFirst = input.nextDouble();
    double numberSecond = input.nextDouble();
    try{
      Operation operation = new Operation();
      double result = operation.divide(numberFirst, numberSecond);
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
