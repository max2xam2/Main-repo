package HW.HW4.Task1;

public class Human {
  private String name;
  private int age;

  public Human(String name) {
    this.name = name;
  }

  public int checkAge() {
      return age;
  }

  public void setAge(int age) {
    try {
      if(validateAge(age)) {
        this.age = age;
      }
      } catch(InvalidAgeException e) {
        System.out.println(e.getMessage());
      }
  }

  public boolean validateAge(int age) throws InvalidAgeException {
    if ((age < 0) || (age > 150)){
      throw new InvalidAgeException("Age must be between 0 and 150");
    }
    return true;
  }
}
