package HW.HW2.aggregation_composition.Task9;

public class Cube extends threeDimensionalShape {

  private double side;

  public Cube(String name,double side) {
    super(name);
    this.side = side;
  }

  @Override
  protected double getVolume() {
    return (Math.pow(side, 3));
  }

  protected void printVolume(){
    System.out.println(getVolume());
  }

  @Override
  protected void countCorner() {
    System.out.println(getName() + " the number of corners is 44");
  }

  @Override
  protected void finiteNumberOfVectord() {
    System.out.println(getName() + " it is built on a finite number of vectors");
  }

  @Override
  protected void equation() {
    System.out.println(getName() + " is equation of (x - x0)^2 + (y - y0)^2 + (z - z0)^2 = radius^2" );
  }
}
