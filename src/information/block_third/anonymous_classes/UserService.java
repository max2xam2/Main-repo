package information.block_third.anonymous_classes;

public abstract class UserService {

  protected String source;

  public UserService(String source) {
    this.source = source;
  }

  public abstract void save(String name);

  public void log(String name) {
    System.out.println("Log user: " + name);
  }
}

