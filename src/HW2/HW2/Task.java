package HW2.HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task {
  public static void main(String[] args) {
    //1
    List<String> listString = new ArrayList<>(List.of("armavir", "andrey", "maks","avokado"));
    Stream<String> stream = listString.stream();
    List<String> stringList = stream
            .filter(str -> str.charAt(0) == 'a')
            .collect(Collectors.toList());

    //2
    List<Integer> listInteger = new ArrayList<>(List.of(1,2,3,4,29834,234));
    Stream<Integer> stream2 = listInteger.stream();
    List<Integer> newListIntegerStream = stream2
            .map(x -> x * 2)
            .collect(Collectors.toList());

    //3
    List<Integer> numbers = List.of(1, 3, 7, 10, 5);
    int result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .findFirst()
            .orElse(-1);

    //4
    IntStream intStream = IntStream.rangeClosed(1, 100);
    int sum = intStream
            .skip(10)
            .limit(5)
            .reduce(0, Integer::sum);

    //5
    List<Integer> listInteger5 = new ArrayList<>(List.of(1,2,3,4,5,1,2,9,324,89,234,230,234,432,324));
    Stream<Integer> stream5 = listInteger5.stream();
    List<Integer> newListInteger5 = stream5
            .distinct()
            .sorted()
            .collect(Collectors.toList());

    //6
    Person person1 = new Person("Igor", 200);
    Person person2 = new Person("Sava", 18);
    Person person3 = new Person("Kirill", 39);
    Person person4 = new Person("Sasha", 50);
    Person person5 = new Person("Sergey", 16);

    List<Person> personList = new ArrayList<>(List.of(person1,person2,person3,person4,person5));
    Stream<Person> stream6 = personList.stream();
    List<Person> newListString6 = stream6
            .filter(p -> p.getAge() > 18)
            .collect(Collectors.toList());
    for (Person person : newListString6) {
    }

    //7

    //8
    List<String> newListString8 = new ArrayList<>(List.of("sjhdf","jsdhfgjsk","134","12312sdsg"));
    Stream<String> stream8 = newListString8.stream();
    long count = stream8.filter(str -> str.length() > 5).collect(Collectors.counting());

    //9
    List<String> newListString9 = new ArrayList<>(List.of("sjhdf","jsdhfgjsk","134","12312sdsg", "лфоывр"));
    Stream<String> stream9 = newListString9.stream();
    String stringResult = stream9.collect(Collectors.joining(", "));
    System.out.println(stringResult);



  }
}
