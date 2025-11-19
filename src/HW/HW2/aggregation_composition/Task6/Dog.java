package HW.HW2.aggregation_composition.Task6;

public class Dog extends Animal {
  public String name;
  public int age;
  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void sound(){
    System.out.println("гав");
  }

  public void action(){
    System.out.println("Dog is running");
  }

}
