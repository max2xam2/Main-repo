package HW.HW2.aggregation_composition.Task2;

public class Developer extends Employee {
  Developer(String firstName,int age) {
    super(firstName,age);
  }

  @Override
  public void work() {
    System.out.println("Developer is backend" + name);
  }
}
