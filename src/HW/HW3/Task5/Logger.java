package HW.HW3.Task5;

public interface Logger {
  public void log(String message);

  static void printLogHeader(){
    System.out.println("=== LOG START ===");
  }
}
