package HW.HW2.aggregation_composition.Task11;

public class Hehagon extends Figure {

  public Hehagon(double side) {
    this.side = side;
  }

  @Override
  double getArea() {
    return (((3 * Math.sqrt(3)) / 2) * (Math.pow(side,2)));
  }

  @Override
  double getSumCorner() {
    return ((6-2) * 180);
  }
}
