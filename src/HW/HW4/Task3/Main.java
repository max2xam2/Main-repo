package HW.HW4.Task3;

import java.util.Scanner;

public class Main {
  static int checkSymbol(int[] array, int k){
    if (k >= array.length){
      throw new ArrayIndexOutOfBoundsException();
    }
    return array[k];
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    int[] array = new int[count];
    for (int i = 0; i < count; i++){
      array[i] = input.nextInt();
    }
    System.out.println(checkSymbol(array, 5));
  }
}
