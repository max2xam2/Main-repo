package information.block_third.anonymous_classes;

public class NewUserService {

  protected String source;

  public NewUserService(String source) {
    this.source = source;
  }

  public void newSave(String name) {
    System.out.println("Default save: " + name);
  }

  public void newLog(String name) {
    System.out.println("New log user: " + name);
  }
}

