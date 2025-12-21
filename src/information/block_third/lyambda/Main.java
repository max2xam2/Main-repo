package information.block_third.lyambda;

/*Лямбда-функции появились в Java 8, логически заменяют анонимные классы, которые реализуют функциональный интерфейс.
* Отличие сигнатуры лямбда-выражения от реализации полноценного метода заключается в том, что лямбда-выражение
* состоит из (списка аргументов) -> {тело функции}. Лямбда может использовать переменные внешней области видимости,
* которые объявлены как final, лямбда захватывает значение переменной, а не саму переменную.
* Не может менять захваченные локальные переменные и нельзя возвращать не тот тип.
* Не имеют полей. Список аргументов - примитивы, объекты, дженерики. Передавая объект в лямбду мы можем далее работать
* с ним также, как и в обычном методе, читаем поля, вызываем методы, также мы можем менять состояние объекта,
* но не можем переприсваивать ссылку или менять final переменные. В теле циклов - можно возвращать примитивы, вернуть
* объекты, вызывать методы объектов, работать с полями объектов, условия(обязательно должен быть return, если не void).
* */

import java.util.List;
public class Main {
  public static void main(String[] args) {
    List<String> names = List.of("Alice", "Bob", "Charlie", "Amanda", "Ala");
    names.stream()
            .filter(name -> name.startsWith("A"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

    User country = new User("Russia", "Moskwa", 2026);

    UserInterfaces printName = user -> System.out.println(user.getName());

    UserInterfaces checkAge = user -> System.out.println(user.getAge());

    printName.check(country);

    checkAge.check(country);
  }
}
