package HW.HW3.Task3;

public class User {
  private String name;
  private int id;

  private static int countCreatedUsers;
  static int nextId;

  public User(String name) {
    this.name = name;
    this.id = nextId++;
    countCreatedUsers++;
  }

  public static int getNextId() {
    return nextId;
  }

  public int getId() {
    return id;
  }

  public static int getCountCreatedUsers(){
    return countCreatedUsers;
  }
}
