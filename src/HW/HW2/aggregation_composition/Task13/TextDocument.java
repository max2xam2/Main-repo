package HW.HW2.aggregation_composition.Task13;

public class TextDocument extends Document {
  public TextDocument(String title) {
    this.title = title;
  }

  @Override
  void open(){
    int numberOfPages = 17;
    System.out.println("TextDocument is open: " + numberOfPages);
  }
}
