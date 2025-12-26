package information.block_third.stream;

/*
* До появления Stream API работа с коллекциями, массивов и файлов осуществлялась через циклы, условные операторы,
* проверки и так далее, из-за этого код получался очень громоздким. Появление Stream API позволило работать нам
* с этими данными в функциональном стиле, а также облегчая параллельное выполнение операций.
* Stream api нежелателен если код выполняется очень часто, будут происходить очень частые вызовы методов,
* autoboxing/unboxing также будет выполняться часто, также когда нужно сложноизменяемая логика, много проверок,
* команда break, большое количество счетчиков.*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args){
    List<Integer> newList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    Stream<Integer> stream = newList.stream();
  }
}
