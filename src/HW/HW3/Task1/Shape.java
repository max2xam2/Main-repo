package HW.HW3.Task1;

public interface Shape {

  public double calculateArea();

  static double calculatePerimeter(Shape shape1, Shape shape2) {
    return shape1.calculateArea() + shape2.calculateArea();
  }
}
