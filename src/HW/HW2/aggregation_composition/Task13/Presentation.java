package HW.HW2.aggregation_composition.Task13;

public class Presentation extends Document {
  public Presentation(String title) {
    this.title = title;
  }

  @Override
  void open(){
    System.out.println("Presentation is open");
  }
}
