package HW.HW2.aggregation_composition.Task9;

public class Circle extends twoDimensionalShape {

  private double radius;

  Circle(String name,double radius){
    super(name);
    this.radius = radius;
  }

  @Override
  protected double getArea() {
    return Math.PI * radius * radius;
  }

  protected void printArea(){
    System.out.println(getArea());
  }


  @Override
  protected void finiteNumberOfVectord(){
    System.out.println(getName() + " it is not built on a finite number of vectors");
  };

  @Override
  protected void countCorner(){
    System.out.println(getName() + " it has no corners");
  }

  @Override
  protected void equation(){
    System.out.println(getName() + " is equation of (x - x0)^2 + (y - y0)^2 = radius^2" );
  }
}
