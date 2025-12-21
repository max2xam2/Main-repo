package information.block_third.functional_interfaces;

import information.block_third.lyambda.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AddUser {
  public static void main(String[] args) {
    User country1 = new User("Belarus", "Moskwa", 1283);

    User country2 = new User("Armenia", "Moskwa", 438957);

    User country3 = new User("Georgia", "Moskwa", 345);

    User country4 = new User("KNDR", "Moskwa", 23);

    User country5 = new User("Russia", "Moskwa", 3883);

    List<User> listUser = new ArrayList<>(List.of(country1, country2, country3, country4, country5));

    method(listUser, (u) -> u.getAge() >= 50);
    System.out.println();
    method(listUser, (u) -> u.getName().startsWith("R"));
  }

  static void method(List<User> users, Predicate<User> predicate) {
    for(User newUser : users) {
      if(predicate.test(newUser)){
        System.out.println(newUser);
      }
    }
  }
}