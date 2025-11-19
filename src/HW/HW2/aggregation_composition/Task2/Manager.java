package HW.HW2.aggregation_composition.Task2;

public class Manager extends Employee {
  private int experience;

  public Manager(String name, int age, int experience) {
    super(name, age);
    this.experience = experience;
  }

  @Override
  public void work() {
    System.out.println("Manager is real");
  }
}
