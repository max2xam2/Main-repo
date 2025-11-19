package HW.HW2.aggregation_composition.Task6;

public class Cat extends Animal {
  public String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public void sound(){
    System.out.println("мяу");
  }

  public void eat(){
    System.out.println("Cat is eating");
  }
}
