package lesson.lesson_11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args){
    List<Integer> numberList = new ArrayList<>();
    numberList.add(1);
    numberList.add(2);
    numberList.add(3);
    numberList.add(4);
    numberList.add(null);
    numberList.add(6);
    numberList.add(7);

    numberList.add(8);
    numberList.add(9);
    numberList.add(10);
    numberList.add(11);


    // 1 -> peek ->
    //1 22 22 5 6 6 7 7 8 8 9 9
    List<Integer> newNewList = numberList.stream()
            .peek(System.out::println)
            .filter(Objects::nonNull)
            .filter(ch -> (ch > 5))
            .peek(System.out::println)
            .toList();

    Integer [] arr = numberList.stream()
            .toArray(Integer[]::new);

   List<Integer> ss =  Arrays.stream(arr)
            .toList();

//   int [] arr2 = numberList.stream()
//            .mapToInt(Integer::valueOf)
//            .toArray();

//   Set<Integer> kk = numberList.stream()
//           .distinct()
//           .peek(System.out::println)
//           .filter(ch -> {
//             return  (ch > 5);
//           })
//           .limit(2)
//           .collect(Collectors.toCollection(HashSet::new));

//
//    System.out.println(kk);


    //System.out.println(newNewList);



    List<User> users = new ArrayList<>();
    users.add(new User(1,"Vitto"));
    users.add(new User(2,"Allina"));
    users.add(new User(3,"Sara"));
    users.add(new User(4,"Lesly"));
    users.add(new User(38274,"Lesly"));
    users.add(new User(2026,"Vitto"));
    users.add(new User(879,"Allina"));
    users.add(new User(456,"Allina"));
    users.add(new User(3455,"Allina"));
    users.add(new User(86345,"Allina"));
    users.add(new User(2314,"Sara"));
    users.add(new User(5444,"Sara"));
    users.add(new User(239476,"Sara"));
    users.add(new User(863,"Sara"));
    users.add(new User(9000,"Sara"));




    Map<Integer,String> mapFromUsers = users.stream()
            .collect(Collectors.toMap(
                    User::getId,//ключ
                    User::getName));


    /*Map<String,User> mapFromUsers2 = users.stream()
            .collect(Collectors.toMap(
                    User::getName,
                    user->user));*/

    Map<String, List<User>> newHashMap = users.stream()
                    .collect(Collectors.groupingBy(User::getName));//key

    List<User> newListUsers = newHashMap.get("Vitto");//возвращается лист юзеров

    Map<String, Long> newIteratorName = users.stream()
            .collect(Collectors.groupingBy(User::getName, Collectors.counting()));

    Map<String,Long> newNewNewHashMap = newIteratorName.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (a, b) -> a,
                                    LinkedHashMap::new));
    System.out.println(newNewNewHashMap);
    //System.out.println(newListUsers);
  }
}

/**/


class User{
  private String name;
  private int id;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
