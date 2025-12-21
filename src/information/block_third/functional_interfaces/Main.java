package information.block_third.functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;


/* Функциональный интерфейс - это интерфейс с одним абстрактным методом и неограниченным количество static и default
* методами. Каждый функциональный интерфейс помечается аннотацией @FunctionalInterface - для гарантии того, что мы не
* создадим еще один абстрактный метод. Можно добавлять неограниченное количество метод с реализацией, что не нарушает
* функциональный контракт. Также в java есть встроенные функциональные интерфейсы, которые находятся в пакете
* java.util.function, они предоставляют готовые методы для работы с лямбда-выражениями и ссылками на методы. */

public class Main {
  public static void main(String[] args) {


    /*//С помощью лямбда-выражения
    FuncInt sumaFunc = (a, b) -> a + b;
    System.out.println(sumaFunc.sum(1, 2));*/
    /*Запись состоит из параметра, которые будут переданы в метод и тела метода,
     * где возвращается нужная запись, далее компилятор сам создает анонимный объект класса,
     * который реализует sum через эту функцию*/

    /*sumaFunc.printInfo("OOO", 18); //вызов default метода

    FuncInt.printInfo("OOP"); // вызов static метода*/

    /*
    //С помощью анонимного класса
    FuncInt methodSumaInt = new FuncInt() {
      @Override
      public int sum(int a, int b) {
        return a + b;
      }
    };
    System.out.println(methodSumaInt.sum(1, 2));
    */
    /*Создается анонимный класс, реализующий интерфейс FuncInt и компилятор
     * создает класс с нашим методом, далее реализуем единственный абстрактный метод и вызываем
     * метод нашего класса, default и static методы также можно вызвать, потому что они уже
     * реализованы.*/

    /*Также существуют базовые функциональные интерфейсы добавленные в Java 8. Не подерживает проверяемые исключения,
     * поэтому их нужно оборачивать и пользоваться throw.*/

    /*1)Consumer<T> - функциональный интерфейс, который принимает один параметр на вход и не возвращает никаких
     * выходных данных. Имеет три встроенных метода: абстрактный accept(T t) - главный метод, именно он выполняет
     * действие, можем вызвать действие, изменить объект, что-то взять и вывести. Но самое главное этот метод ничего не
     * возвращает. Также есть default-метод Consumer<T> andThen(Consumer<? super T> after) - позволяет объединять
     * действия в цепочку. Он не изменяет никакие данные, не передает данные следующему Consumer, он просто позволяет
     * объединять много действий в цепочку и запускать одним вызовом. Если один из Consumer в цепочке null, то падает
     * работа всей программы и пробрасывается ошибка NullPointerException. Также есть еще один метод
     * static <T> Consumer<T> identity() - возвращает Consumer, который ничего не делает.
     * Также еще есть BiConsumer<T,U> - с арностью 2, работает точно также, можно использовать для суммы чисел.
     * Также есть методы для работы с примитивными типами данных, они выполняются быстрее потому что у нас не будет
     * операций autoboxing/unboxing, которые создают дополнительные объекты и лишние операции. IntConsuer,
     * LongConsumer, DoubleConsumer
     * */

    /*
    Consumer<Integer> printInfo = (a) -> System.out.println(a);
    Consumer<Integer> printInfo2 = (a) -> System.out.println(a * 2);

    printInfo.accept(3);

    Consumer<Integer> printInfo3 = printInfo.andThen(printInfo2);

    printInfo3.accept(82374);
    */

    //Consumer<String> maybePrint = null;

    //Нельзя:
    //maybePrint.andThen(System.out::println); // NPE

    //С identity:
    //Consumer<String> safe = (maybePrint != null) ? maybePrint : Consumer.identity();
    //safe.andThen(System.out::println).accept("Hello"); // работает
    /*Создаем переменную maybePrint типа Consumer, но пока равную null, но при вызове andThen пробросится ошибка NPE.
     * Во втором случае использования identity, мы проверяем с помощью тернарного оператора maybePrint != null, если
     * != null, то используем его, а иначе ничего не делаем и благодаря этому safe не будет равным null,
     * */

    /*2)Supplier - самый простой функциональный интерфейс без входных данных, которые не совершает никаких действий,
     * кроме выдай значение, имеет единственный метод - T get(). Например можем использовать для ленивого создания объектов,
     * то есть объект создается только во время вызова, также просто задавать дефолтное значение.
     * Может возвращать null, но NPE пробросится если мы будем использовать этот результат, потому что не можем
     * вызывать методы у null. Нужно проверять значение или использовать Optional. Также существует несколько видов
     * Supplier для работы с примитивными данными, время работы быстрее, потому что не происходит распаковки и
     * автоупаковки, а работаем напрямую, более чистый код. IntSupplier, DoubleSupplier, LongSupplier, BooleanSuppleir.
     * Supplier + Optional - выполняем действие, когда есть значение.
     * Аналогично существуют специализации для работы с примитивами, IntSupplier int() -> int,
     * LongSupplier long() -> long, DoubleSupplier double() -> double
     */

    /*
    Supplier<String> helloSupplier = () -> "null";
    System.out.println(helloSupplier.get());
     */

    /*3)Predicate<T> - функциональный интерфейс, проверяющий какое либо условие и возвращающий true/false.
    * Имеет абстрактный метод test() - описать его поведение можем либо через лямбду, либо через полноценный класс.
    * Также есть несколько методов для композиции условий и статический метод isEqual(Object targetRef), который
    * проверяет равенство с объектом. Также есть методы, которые нужны для создания композиции условий:
    * and(Predicate<? super T> other) - логическое И
    * or(Predicate<? super T> other) - логическое ИЛИ
    * negate() - логическое НЕ
    * not(Predicate<? super T> predicate) - статический вариант negate
    * Чаще всего используется в Stream API,Optional. Predicate не защищен от работы с null, еесли в test() будет передан
    *  null и внутри будут вызовы методов на этом объекте, то возникнет  NPE, поэтому лучше использовать Optional,
    * если Optional пуст, тогда Predicate не будет вызываться, что исключает работу с null, если значение есть,
    * то вызывается predicate.test(). Также если мы строим композицию из условий и T это тип, который проверяет текущий
    * Predicate, то другой предикат должен работать либо с этим же типом T, либо с его супертипом.
    * Также есть метод BiPredicate<T,U> - для работы с 2 аргументами, это логическая проверка для 2-х аргументов.
    * Также существуют специализации для работы с примитивами: IntPredicate int() -> boolean
    * LongPredicate long() -> boolean, DoublePredicate() -> boolean
    */

    /*
    List<String> people = new ArrayList<>(List.of("Kate", "Maks", "Basta","JHSGFHGf", "skjdfskhkh"));

    //test() - проверка, что первый символ в переданном имени K
    Predicate<String> checkFirst = s -> s.startsWith("K");
    Predicate<String> checkLast = s -> s.length() != 2;
    Predicate<String> checkLast2 = s -> s.endsWith("G");
    Predicate<String> checkLast3 = s -> s.startsWith("M");
    System.out.println(checkFirst.test(people.get(2))); //false
    System.out.println(checkLast.test(people.get(0))); //true

    //and() - композиция условий, начинается с K и длина имени != 2
    Predicate<String> checkTwoConditionsAnd = checkFirst.and(checkLast);
    System.out.println(checkTwoConditionsAnd.test(people.get(4))); //false


    //or() - композиция условий, заканчивается на G, либо начинается на M
    Predicate<String> checkTwoConditionsOr = checkLast.or(checkLast3);
    System.out.println(checkTwoConditionsOr.test(people.get(1))); //true

    //negate() - отрицание какого либо условия, логическое НЕ
    Predicate<String> negateConditionFirst = checkFirst.negate();
    System.out.println(negateConditionFirst.test(people.get(2))); //true

    //isEqual() - проверка на равенство элементов
    Predicate<String> checkEqualsName = Predicate.isEqual("Limba");
    System.out.println(checkEqualsName.test(people.get(2))); //false
     */

    /*4)Function<T,R> - функциональный интерфейс, который принимает аргумент типа T и возвращает результат типа R.
    * Имеет абстрактный метод R apply(T t), то есть выполняется преобразование объекта типа T, которое было описано
    * в apply к типу R, также имеет два метода - compose() и andThen(), которые нужны для создания цепочек выполнения
    * функций, а также есть метод identity() - возвращает то, что получает на вход без изменений типа, используется для
    * Stream Api и коллекций, часто применяется когда нужно использовать объект как ключ или значение, не преобразуя
    * его, а также когда нужно передать функцию как заглушку, которая ничего не делает, просто используем
    * Function.identity(). Метод compose() и andThen() работают внутри с apply(),
    * compose() - default <V> Function<V, R> compose(Function<? super V, ? extends T> before), задача function
    * вернуть результат типа R из аргумента типа V, с помощью метода compose(), нам на вход подается тип V,
    * далее с помощью функции before(такой же Function, у которой есть метод T apply(V v)), далее текущая функция
    * преобразует данные T -> R, итоговая комбинированная функция даст нам результат V -> R;
    * andThen() - default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) - выполняет функции
    * последовательно, сначала текущую T-> R, а потом after R -> V.
    * Также существует метод Function<T, U, R> - передаем функцию, которая принимает два аргумента и возвращает значение
    * вызываем apply(T, U) и получаем результат R.
    * Существует 3 основных вида реализации метода apply - лямбда функции, метод ссылок и полноценный класс.
    */

    /*1)С помощью лямбда функции. Вместо length, можем вызывать любой метод, который возвращает Int/Integer,
    * также может быть блок кода с return, в котором задана какая-то логика, также может быть вызов какого либо
    * статического метода. Нельзя писать то, что ничего не возвращает(void), возвращает несовместимый тип.*/

    Function<String, Integer> length = s -> s.length();
    System.out.println(length.apply("Limba"));

    /*2)С помощью метода ссылок - короткая запись лямбда-выражения, но он указывает на уже существующий метод,
    * не вызывая его, то есть передает ссылку на этот метод, как на реализацию его в интерфейсе.
    * Основные методы ссылок: можем передать ссылку на статический метод класса, на нестатический метод класса,
    * ссылка на метод конкретного объекта и также можно передавать ссылку на конструктор, то есть мы передаем правило
    * создания объекта, а не сам объект.*/

    Function<String, StringBuilder> f = StringBuilder::new; // передали правило,
    /*то есть передаем правило, для каждого String вызывай конструктор StringBuilder(String) и возвращай результат */
    StringBuilder sb = f.apply("abc"); // объект создает здесь, при вызове apply
    sb.append("def"); // обычный метод на объекте

    //Ссылка на статический метод
    Function<String, Integer> stringToInteger = Integer::parseInt;
    System.out.println(stringToInteger.apply("87324"));

    //Ссылка на нестатический метод, который вызывается у объекта
    Function<String, Integer> checkLength = String::length;
    Integer intLength = checkLength.apply("Hello,world");
    System.out.println(intLength);

    /*Ссылка на метод, по факты пример выше тоже является ссылкой на метод, потому что мы обращаемся к методу класса
    String*/

    //Ссылка на метод объекта, который уже создан и аргумент передается как парметр метода
    String forConcat = "Maks";
    Function<String, String> addString = forConcat::concat;
    String newString = addString.apply(" Hello");
    System.out.println(newString);




  }
}