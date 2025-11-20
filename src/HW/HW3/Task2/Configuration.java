package HW.HW3.Task2;

public class Configuration {
  private String databaseUrl;
  public Configuration(String databaseUrl) {
    this.databaseUrl = databaseUrl;
  }

  static String getDefaultUrl(){
    return "localhost:5432";
  }
}
