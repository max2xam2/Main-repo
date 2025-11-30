package lesson.lesson6;

import java.util.ArrayList;
import java.util.List;


public class Main {

  static <T> void method(T p){}

  public static void main(String[] args) {
    Product <String> product1  = new Product<>("");
    Product <Integer> product2  = new Product<>(0);
    List<String> newList = new ArrayList<>();
    List<Animal> listAnimal = new ArrayList<>();
    List<Cat> listCat = new ArrayList<>();

    Cat cat1 = new Cat();
    Animal animal1 = new Animal();
    listAnimal.add(cat1);
    listAnimal.add(animal1);

    listCat.add(cat1);
    //listCat.add(animal1);

    List<? super Animal> newListAnimal = new ArrayList<>();
    newListAnimal.add(cat1);
    newListAnimal.add(animal1);
    //extends - чтение, а super - добавление, но чтение Object, ? - любой тип данных
  }
}
