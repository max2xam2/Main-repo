package HW.HW2.aggregation_composition.Task13;

public class Table extends Document {
  public Table(String title) {
    this.title = title;
  }

  @Override
  void open(){
    System.out.println("Table is open");
  }
}
