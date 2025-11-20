package HW.HW3.Task3;

public class User {
  private String name;
  private int id;
  private static int countCreatedUsers;
  static int nextId;

  public User(String name, int id) {
    this.name = name;
    this.id = id;
    countCreatedUsers++;
  }

  public static int getCountCreatedUsers(){
    return countCreatedUsers;
  }
}
