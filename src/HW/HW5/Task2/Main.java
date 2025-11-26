package HW.HW5.Task2;

import java.util.Scanner;

class Box<T>{
  private T symbol;

  public Box(T symbol){
    this.symbol = symbol;
  }

  public T getSymbol(){
    return symbol;
  }

  public void setSymbol(T symbol){
    this.symbol = symbol;
  }
}

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();
    Box<String> newBox = new Box<>(line);
    System.out.println(newBox.getSymbol());
    newBox.setSymbol("NO");
    System.out.println(newBox.getSymbol());
  }
}
