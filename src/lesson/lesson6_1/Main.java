package lesson.lesson6_1;

import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    List<Integer> listik = new LinkedList<>();

    for (int i = 0; i <= 1000000; i++){
      listik.add(i);
    }

    long timeStart = System.nanoTime();

    for (int i = 0; i <= 150000; i++){
      listik.remove(0);
    }
    long timeEnd = System.nanoTime();
    System.out.println((timeEnd-timeStart));
    System.out.println((timeEnd-timeStart)/1_000_000);
    System.out.println((timeEnd-timeStart)/1_000_000_000);
  }
}
