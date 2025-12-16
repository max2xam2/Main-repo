package information.block_third.functional_interfaces;

@FunctionalInterface
public interface FuncInt {
  int sum(int a, int b); /*абстрактный только один, потому что лямбда выражение или ссылка на метод
  не может быть преобразована только к одному методу, иначе компилятор не поймет, что именно нужно реализовать.*/

  default void printInfo(String info, int number){
    System.out.println("Hello, " + info + "!" + number);
  }/*может быть сколько угодно, потому что они уже имеют готовую реализацию и не
  увеличивает количество абстрактных методов*/

  static void printInfo(String info){
    System.out.println("Hello, " + info);
  } /*не относятся к экземплярам интерфейса, поэтому лямбда-выражения будут их использовать
  */
}