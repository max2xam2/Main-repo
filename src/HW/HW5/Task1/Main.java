package HW.HW5.Task1;

import java.util.Scanner;

class Pair<T,U>{
  private T first;
  private U second;

  public Pair(T first, U second){
    this.first = first;
    this.second = second;
  }

  public T getFirst(){
    return first;
  }

  public void setFirst(T first){
    this.first = first;
  }

  public U getSecond(){
    return second;
  }

  public void setSecond(U second){
    this.second = second;
  }

  @Override
  public String toString(){
    return ("first symbol: " + first + " second symbol: " + second);
  }
}

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int numberFirst = input.nextInt();
    int numberSecond = input.nextInt();
    Pair <Integer,Integer> pair = new Pair <>(numberFirst,numberSecond);
    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());
    System.out.println(pair.toString());
  }
}
