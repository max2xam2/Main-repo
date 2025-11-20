package lesson.lesson4.Task1;

public class Calculator {
  public double add(double a, double b) throws NegativeExceprion {
    if(a < 0) {
        throw new NegativeExceprion("От отрицательного числа процент невычислим");
    }
    return (a * (b / 100));
  }
}
