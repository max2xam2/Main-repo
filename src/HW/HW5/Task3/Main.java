package HW.HW5.Task3;

import java.util.Scanner;
import java.util.Arrays;


class ArraySort{
  public static <T> T getSymbolIndex(T[] array, int index) throws isNoSuchIndex{
    int length = array.length;
    if ((index < 0) || (index >= length)) {
      throw new isNoSuchIndex("There is no such index");
    }
    return array[index];
  }
}

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    String[] array = new String[count];
    for (int i = 0; i < count; i ++){
      array[i] = input.next();
    }
    int numberIndex = input.nextInt();
    try {
      String symbol = ArraySort.getSymbolIndex(array, numberIndex);
      System.out.println(symbol);
    } catch(isNoSuchIndex e) {
      System.out.println(e.getMessage());
    }
  }
}
