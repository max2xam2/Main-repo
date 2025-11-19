package HW.HW2.aggregation_composition.Task9;

public class threeDimensionalShape extends Figure {
  threeDimensionalShape(String name){
    super(name);
  }

  @Override
  protected void usedSpace(){
    System.out.println("Three-dimensional space is used");
  }

  protected double getVolume(){
    return 0.0;
  };


}
