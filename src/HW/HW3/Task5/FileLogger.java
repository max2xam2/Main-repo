package HW.HW3.Task5;

public class FileLogger implements Logger{
  private String filePath;

  static int logCounter;

  public FileLogger(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public void log(String message) {
    logCounter++;
    System.out.println(logCounter + " " + message);
  }
}
