package HW.HW2.aggregation_composition.Task2;

public class Employee {
  protected String name;
  protected int age;

  public Employee(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void work(){
    System.out.println(this.name + " is very hard working");
  }
}
