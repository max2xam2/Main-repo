package HW.HW2.aggregation_composition.Task11;

public class Foriangle extends Figure {
  public Foriangle(double side) {
    this.side = side;
  }

  @Override
  double getArea() {
    return Math.pow(side, 2);
  }

  @Override
  double getSumCorner() {
    return ((4 - 2) * 180);
  }
}