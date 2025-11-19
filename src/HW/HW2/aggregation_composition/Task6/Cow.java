package HW.HW2.aggregation_composition.Task6;

public class Cow extends Animal {
  public String name;
  public String breed;

  public Cow(String name, String dreed){
    this.name = name;
    this.breed = breed;
  }

  @Override
  public void sound(){
    System.out.println("Cow sound");
  }
}
