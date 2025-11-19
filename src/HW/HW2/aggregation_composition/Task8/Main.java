package HW.HW2.aggregation_composition.Task8;

public class Main {
  public static void main(String[] args) {
    User user = new User("Sergey", 18, "sergey@gamil.com");
    user.setAge(28);
    user.printAge();
    user.setAge(-7123645);
    user.printName();
    user.setName("asjhgd976(jkhjksadJJHB");
    user.printName();
    user.printAge();;
    user.setEmail("jshdgf@jeep.com");
    user.printEmail();
    user.setEmail("12345567@gmail.com");
    user.printEmail();
  }
}
