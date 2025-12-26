package information.block_first.arrays;

/*Массивом в Java может назвать структуру данных, которая имеет фиксированный размер и хранит однотипные данные.
 * Состоит из ячеек, которые последовательно расположены в памяти, каждая ячейка обладает адресом(индексом),
 * благодаря которому можно получить к ней доступ.
 * int[] array = new int[m] - создание массива типа int на m ячеек. Оператор new выделяет место в памяти(куче(
 * для заголовка объекта, длины массива и типу данных массива) место под хранение m значений типа int,
 * затем JVM возвращает ссылку(в стеке) на начало области памяти(первый элемент), выделенной под массив, и ссылка
 * помещается в переменную array того же типа, что и массив. Массивы также неявно наследуются от класса Object.
 * Тип массива может быть любым(boolean, string и тд). С помощью команд можем обратиться к массиву array и получить
 * информацию: array.getClass() - возвращает инфо о типе массива([-одномерный и тд),
 * типе хранимых данных(I - int, C - char и тд). array.getClass().getSuperclass() - имя супер класса массива.
 * array.getClass().getMethods() - методы массива. Также есть поле length - возвращает количество элементов массива.
 *  Также важно отметить массивы с нулевой длиной и указателем на null:
 * int[] array = new int{} - массив нулевого размера, объект имеющий заголовок и размер, ссылка на него также сохраняется
 * в переменную, но у него нет места в памяти. int[] array = null - массив, ссылающийся на null(маркер отсутствия
 * указателя на объект). Массив нулевой длины не равен массиву, который ссылается на null. Также в Java всегда происходит
 * размера массива и выхода за границу массива, поэтому обращение за его пределы вызовет исключение. */

import java.util.Scanner;

/*public class Array {

  static class People {
    String name;
    int age;
    int height;
    boolean married;

    People(String name){
      this.name = name;
    }

    People(String name, int age){
      this.name = name;
      this.age = age;
    }

    People(String name, int age, int height, boolean married){
      this.name = name;
      this.age = age;
      this.height = height;
      this.married = married;
    }
  }*/

public class Main {

  public static void main(String[] args) {

    //int[] arrayFirst = new int[5]; выделение 5 ячеек в памяти, сейчас там {0,0,0,0,0} примитивные типы данных

    //int[] arraySecond = {1,2,3} - так можно поступать с любым типом данных, размер массива вычислят компилятор

    //int[] arrayThird = new int[]{1,2,3}

    //int[] zero = {}, int[] zero = new int[0], int zero = new int[] {} - инициализация пустого массива

    //Main[] array = new Main[2] - массив объектов, без создания объектов {null,null,null,null,null}

    //static int[] array = {1,9,8,6} - инициализация статического поля

    /*Отдельно стоит поговорить про массивы объектов. Есть класс People(name, age, height, married)*/

    //People[] people = new People[10]; создается массив ссылок(объекты не создаются) {null,null,null,null,null}

    /*People[] people = {
            new People("Sasha", 13,18,true),
            new People("Katya"),
            new People("Masha", 18)
    }; - остальные поля инициализируются как null, 0, false
    */

    /*Вариант с выборочной инициализацией полей*/
//    People[] people - new People[3]
//    people[0] = new People("Lenya");
//    people[1] = new People("Nastya",18,19,false)
//    people[2] - null

    /*Также можно с помощью списка с объектами и преобразования списка в массив.
        С помощью List.of() - создается неизменяемый список из 2 объектов(а так сколько передали) - это объекты в куче,
    массив ссылок внутри List указыает на эти объекты. Далее toArray(new People[0]) - смотрит, что передали массив
    new People[0], но этого нам мало и он уже сам создает массив нужной длины, по количеству переданных объектов(у нас 2)
    и потом копирует ссылки на объекты из списка в новый массив.
    */
//    List<People> list = List.of(
//            new People("Bob", 18),
//            new People("Alice")
//    );
//    People[] arr = list.toArray(new People[0]);


    /*Также покажем как можно заполнить массив с консоли*/
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt(); //кол-во объектов
//    input.nextLine(); //избалвяемся от /n
//    People[] people = new People[n];
//    for(int i = 0; i < n; i++) {
//      Main name = input.next();
//      int age = input.nextInt();
//      int height = input.nextInt();
//      boolean married = input.nextBoolean();
//      people[i] = new People(name, age, height, married);
//    }
//    for (People p : people) {
//      System.out.println(p.name + " " + p.age + " " + p.height + " " + p.married);
//    }
  }
}
