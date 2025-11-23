package HW.HW4.Task4;

public class Main {

  enum AccessLevel{
    GUEST,USER,ADMIN,SUPER_ADMIN;
  }

  static class User{
    AccessLevel accessLevel;

    public User(AccessLevel accessLevel){
      this.accessLevel = accessLevel;
    }

    public boolean canAccess(User user){
      switch(user.accessLevel){
        case USER, GUEST:
          return false;
        case SUPER_ADMIN, ADMIN:
          return true;
        default:
          return false;
      }
    }
  }

  public static void main(String[] args) {
    User user = new User(AccessLevel.GUEST);
    User userSecond = new User(AccessLevel.ADMIN);
    System.out.println(user.canAccess(userSecond)); //Ничего не понял, создаем две переменные, чтобы проверить
    // одну через другую
  }
}
