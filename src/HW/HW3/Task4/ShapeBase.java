package HW.HW3.Task4;

abstract class ShapeBase implements Drawable {
  @Override
  public void draw(){
    System.out.println("Drawing a shape");
  }

  final void displayInfo(){
    System.out.println("Это фигура");
  }
}
