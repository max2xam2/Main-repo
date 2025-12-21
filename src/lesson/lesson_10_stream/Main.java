package lesson.lesson_10_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    int[] mas = {1,2,3,4,5,6,7,8,9};
    Integer [] mas2 = {10,20,30,40,50,60,70,80,90};
    List<Integer> listNumber = new ArrayList<>(List.of(12,13,14,15,16,17,18,19));
    String str = "Hello World I am Maks";

    IntStream streamInt =  Arrays.stream(mas);
    Stream<Integer> streamInteger = Arrays.stream(mas2);
    Stream<Integer> secondStreamInt = listNumber.stream();
    Stream<String> newStr = str.lines();

    System.out.println(streamInt.average());
    System.out.println(streamInt.sum());

    Arrays.stream(mas)
            .boxed()      //из примитивов делает ссылки
            .toList();
  }
}
