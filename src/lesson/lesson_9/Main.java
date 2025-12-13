package lesson.lesson_9;

import java.util.*;
import java.util.function.Predicate;

public class Main {

//  static void checkStudent(List<Student> students, Checkable<Student> checkable, int e) {
//    for(Student s: students){
//      if(checkable.check(s,3)){
//        System.out.println(s);
//      }
//    }
//  }

  public static void main(String[] args) {

//    List<Student> listStudent = new ArrayList<>();
//
//    listStudent.add(new Student("Иван Петров", 18, 1, true));
//    listStudent.add(new Student("Мария Сидорова", 19, 1, false));
//    listStudent.add(new Student("Алексей Иванов", 20, 2, true));
//    listStudent.add(new Student("Екатерина Смирнова", 21, 2, false));
//    listStudent.add(new Student("Дмитрий Козлов", 19, 1, true));
//    listStudent.add(new Student("Анна Волкова", 20, 2, false));
//    listStudent.add(new Student("Сергей Попов", 22, 3, true));
//    listStudent.add(new Student("Ольга Новикова", 21, 3, false));
//    listStudent.add(new Student("Павел Морозов", 23, 4, true));
//    listStudent.add(new Student("Наталья Зайцева", 22, 4, false));
//    listStudent.add(new Student("Андрей Лебедев", 19, 1, false));
//    listStudent.add(new Student("Татьяна Соколова", 20, 2, true));
//    listStudent.add(new Student("Михаил Орлов", 21, 3, false));
//    listStudent.add(new Student("Елена Павлова", 22, 4, true));
//    listStudent.add(new Student("Артем Гусев", 23, 4, false));
//
//    Set<Integer> setik = new TreeSet<>();
//
//    Map<Integer, Integer> mapik = new IdentityHashMap<>();


//    checkStudent(listStudent,  (s,e) -> {
//      return
//              s.getCourseNumber() > 2 || e == 15;
//    });

    //checkStudent(listStudent, s -> (s.getAge() < 20));

    //checkStudent(listStudent, s -> (s.getName().startsWith("А")));

    Product coll = new Product("Banana", 21736);
    Product coll2 = new Product("Persik", 7964);
    Product coll3 = new Product("Vishnya", 2342);
    Product coll4 = new Product("asjdh", 736);
    List<Product> newList = new ArrayList<>();
    newList.add(coll);
    newList.add(coll2);
    newList.add(coll3);
    newList.add(coll4);

    Comparator<Product> comparator = Comparator.comparing(Product::getName); //cортировка по имени

    List<Product> sortik = newList.stream().sorted(comparator).toList();//передали во внутрь comparator
    for (Product p : sortik){
      System.out.println(p);
    }

    List<Product> newSortik = Collections.synchronizedList(sortik);

    User userok = new User("Banana", 21736);
    userok.name();
  }
}
