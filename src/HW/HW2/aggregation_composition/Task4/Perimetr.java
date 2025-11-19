package HW.HW2.aggregation_composition.Task4;

public class Perimetr {
  protected double st1;
  protected double st2;

  protected Perimetr(double st1, double st2) {
    this.st1 = st1;
    this.st2 = st2;
  }

  protected Perimetr(int s1, int s2) {
    this.st1= st1;
    this.st2 = st2;
  }

  protected double getPerimetr(double st1, double st2){
    return 2*(st1 + st2);
  }

  protected int getPerimetr(int st1, int st2){
    return 2 * (st1 + st2);
  }
}
