package HW.HW2.aggregation_composition.Task4;

public class Triangle implements Figure {

  double a, b, c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  double per = (a+b+c)/2;

  @Override
  public void calculateArea() {
    System.out.println("Perimetr calculateArea:" + Math.sqrt(per * (per-a) * (per - b) * (per - c)));
  }

  @Override
  public void countCorner() {
    System.out.println("3 corners");

  }
}