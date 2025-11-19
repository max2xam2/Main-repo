package HW.HW2.aggregation_composition.Task9;

public class Ball extends threeDimensionalShape{

  private double radius;

  public Ball(String name,double radius) {
    super(name);
    this.radius = radius;
  }

  @Override
  protected double getVolume() {
    return (4/3 * Math.PI * Math.pow(radius, 3));
  }

  protected void printVolume(){
    System.out.println(getVolume());
  }

  @Override
  protected void countCorner() {
    System.out.println(getName() + " it has no corners");
  }

  @Override
  protected void finiteNumberOfVectord() {
    System.out.println(getName() + " it is not built on a finite number of vectors");
  }

  @Override
  protected void equation() {
    System.out.println(getName() + " is equation of (x - x0)^2 + (y - y0)^2 + (z - z0)^2 = radius^2" );
  }
}
