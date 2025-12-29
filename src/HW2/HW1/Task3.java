package HW2.HW1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    int[] arr = new int[count];
    boolean[] check = new boolean[count];

    for (int i = 0; i < count; i ++){
      arr[i] = input.nextInt();
    }

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < count; i ++){
      check[i] = (set.add(arr[i]));
    }

    for (int i = 0; i < count; i ++){
      if (!check[i]){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    input.close();
  }
}
