package HW.HW2.aggregation_composition.Task9;

public class Square extends twoDimensionalShape{
  private double side;
  public Square(String name, double side) {
    super(name);
    this.side = side;
  }

  @Override
  protected double getArea() {
    return side * side;
  }

  protected void printArea(){
    System.out.println(getArea());
  }

  @Override
  protected void finiteNumberOfVectord(){
    System.out.println(getName() + " it is built on a finite number of vectors");
  };

  @Override
  protected void countCorner(){
    System.out.println(getName() + " the number of corners is 4");
  }

  @Override
  protected void equation(){
    System.out.println(getName() + " is equation of |x| <= side and |y| <= side");
  }

}
