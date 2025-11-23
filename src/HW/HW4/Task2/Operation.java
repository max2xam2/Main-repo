package HW.HW4.Task2;

public class Operation {
  public double divide(double a, double b) throws ArithmeticException {
    if (b == 0) {
      throw new AarithmeticException("Делить на 0 не нужно");
    }
    return a / b;
  }
}
