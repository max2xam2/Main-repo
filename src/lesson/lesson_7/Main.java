package lesson.lesson_7;

/*анонимные классики*/

public class Main {

  static void printSkills(Auto auto) {
    auto.startEngine();
  }

  public static void main(String[] args) {
    BMW bmw = new BMW();

    Auto auto = new Auto() {
      @Override
      public void startEngine() {
        System.out.println("Mercedes is a car");
      }
    };

    printSkills(auto);
  }
}
