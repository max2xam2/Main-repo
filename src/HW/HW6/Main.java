package HW.HW6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class Storage <T> {
  ArrayList<T> itemStorage;

  public Storage(Collection<T> itemStorage) {
    this.itemStorage = new ArrayList<>(itemStorage);
  }

  public void addItem(T item){
    itemStorage.add(item);
  }

  public void printItems(){
    for(T item : itemStorage){
      System.out.println(item);
    }
  }

  public <T extends Collection<?>>int getSize(){
    return itemStorage.size();
  }
}

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    List <Integer> list = new ArrayList<>();
    List<String> list1 = new ArrayList<>();

    Storage<String> listString = new Storage<>(list1);
    Storage<Integer> listInteger = new Storage<>(list);

    String command = new String();

    boolean flag = true;

    System.out.println("Начало работы: выберите интересующую команду\n" +

            "Для окончания работы введите: Выход\n" +
            "Доступные команды:\n" +
            "Добавить строку в строковый контейнер, Добавить число в числовой контейнер.\n" +
            "Показать содержимое числового контейнера, Показать содержимое строкового контейнера.\n" +
            "Показать сколько элементов в числовом контейнере, Показать сколько элементов в строковом контейнере.\n" +
            "Выход");

    while(flag){
      command = input.nextLine();
      switch(command){
        case ("Добавить число в числовой контейнер"):
          int number = input.nextInt();
          input.nextLine();
          listInteger.addItem(number);
          break;
        case ("Добавить строку в строковый контейнер"):
          String str = input.nextLine();
          listString.addItem(str);
          break;
        case ("Показать содержимое числового контейнера"):
          listInteger.printItems();
          break;
        case("Показать содержимое строкового контейнера"):
          listString.printItems();
          break;
        case ("Показать сколько элементов в числовом контейнере"):
          System.out.println(listInteger.getSize());
          break;
        case("Показать сколько элементов в строковом контейнере"):
          System.out.println(listString.getSize());
          break;
        case("Выход"):
          flag = false;
          break;
        default:
          System.out.println("Команды не существует, повторите ввод ");
      }
    }
  }
}
