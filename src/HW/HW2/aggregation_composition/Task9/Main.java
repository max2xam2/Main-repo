package HW.HW2.aggregation_composition.Task9;

public class Main {
  public static void main(String[] args) {
    Cube cube = new Cube("Cube", 11);
    cube.finiteNumberOfVectord();
    cube.countCorner();
    cube.equation();
    cube.usedSpace();
    cube.printVolume();

    Square square = new Square("Square", 17);
    square.finiteNumberOfVectord();
    square.countCorner();
    square.equation();
    cube.usedSpace();
    cube.printVolume();
  }
}
