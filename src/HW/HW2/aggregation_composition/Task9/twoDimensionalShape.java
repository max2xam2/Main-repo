package HW.HW2.aggregation_composition.Task9;

import java.awt.*;

public class twoDimensionalShape extends Figure{
  twoDimensionalShape(String name){
    super(name);
  }

  @Override
  protected void usedSpace(){
    System.out.println("Two-dimensional space is used");
  }

  protected double getArea(){
    return 0.0;
  };

}
