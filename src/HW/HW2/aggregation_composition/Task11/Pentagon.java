package HW.HW2.aggregation_composition.Task11;

public class Pentagon extends Figure {
  public Pentagon(double side){
    this.side = side;
  }

  @Override
  public double getArea(){
    return ((5 * Math.pow(side, 2)) / (4 *  Math.tan(Math.PI/5)));
  }

  @Override
  public double getSumCorner() {
    return ((5-2) * 180);
  }

}