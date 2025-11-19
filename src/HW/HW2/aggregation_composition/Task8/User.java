package HW.HW2.aggregation_composition.Task8;

/*Добавлена валидация перед изменением имени, адреса электронной почты и возраста. Также пользователь не сможет
* напрямую обратиться к методам проверки корректности введенных данных, например вызвав по ошибке метод для проверки
* возраста, пользователю вернется значение true, но возраст объекта останется прежним и никак не изменится*/

public class User {
  private String name;
  private int age;
  private String email;
  public User(String name, int age, String email) {
    this.name = name;
    this.age = age;
    this.email = email;
  }

  protected boolean checkAge(int age) {
    if (age >= 18) {
      return true;
    }
    return false;
  }

  private boolean checkTrueName(String name) {
    int len = name.length();
    int sum = 0;
    if (len <= 2){
      return false;
    }
    for(int i = 0; i < len; i++) {
      if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')){
        sum++;
      }
    }
    if(sum == len){
      return true;
    }
    return false;
  }

  private boolean checkEmail(String email) {
    boolean result = false;
    if (email.contains("@") && (email.contains("gmail.com") || email.contains("mail.ru"))) {
      result = true;
    }
    return result;
  }

  public void setEmail(String email) {
    if (checkEmail(email)){
      this.email = email;
    } else{
      System.out.println("Замена адреса электронной почты не была выполнена");
    }
  }

  public void setName(String name){
    if (checkTrueName(name)) {
      this.name = name;
    } else{
      System.out.println("Замена имени не была выполнена");
    }
  }

  public void setAge(int age) {
    if(checkAge(age)) {
      this.age = age;
    } else {
      System.out.println("Замена возраста не произведена");
    }
  }

  public String getName() {
    return name;
  }

  public int getAge(){
    return age;
  }

  public String getEmail() {
    return email;
  }

  public void printName(){
    System.out.println(getName());
  }

  public void printAge(){
    System.out.println(getAge());
  }

  public void printEmail(){
    System.out.println(getEmail());
  }
}
