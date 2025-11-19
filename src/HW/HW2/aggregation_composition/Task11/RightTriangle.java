package HW.HW2.aggregation_composition.Task11;

public class RightTriangle extends Figure {

  public RightTriangle(double side){
    this.side = side;
  }

  @Override
  double getArea() {
    return ((Math.pow(side, 2) * Math.pow(3, (1/2))) / 4);
  }

  @Override
  double getSumCorner() {
    return ((3 - 2) * 180);
  }
}
