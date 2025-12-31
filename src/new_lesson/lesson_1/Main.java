package new_lesson.lesson_1;

import java.util.ArrayList;
import java.util.List;


public class Main {
  public static void main(String[] args) {
    List<List<String>> lists = List.of(List.of("a", "b", "c"), List.of("d", "e", "f"));
    System.out.println(lists.stream()
    .flatMap(list -> list.stream()) //(a b c), (d e f) -> a b c d e f
    .peek(System.out::println));
    //.anyMatch(s -> s.contains("p"))
  }
}
