package HW.HW2.aggregation_composition.Task4;

public class Circle implements Figure {

  double radius;

  @Override
  public void calculateArea() {
    System.out.println("Area od circle is " + (pi * Math.pow(radius,2)));
  }

  @Override
  public void countCorner() {
    System.out.println("0 corners");
  }
}
