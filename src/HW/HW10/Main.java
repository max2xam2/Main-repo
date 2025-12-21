package HW.HW10;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    ReverseString method = new ReverseString() {
      @Override
      public String reverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
      }
    };
    System.out.println(method.reverse(str));
  }
}