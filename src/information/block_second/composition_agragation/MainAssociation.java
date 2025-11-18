package information.block_second.composition_agragation;

/*Такая связь является ассоциацией, потому что объект учитель знает про своих учеников, а объекты
* ученики знают имя и фамилию своего учителя, и они могут существовать независимо друг от друга.*/


class Teacher {
  private String name;

  //private List<Student> students = new ArrayList<>();
  //public void addStudent(Student s) {
  //  students.add(s);
  //}
  //теперь добавилась еще одна связь, до этого только студенты знали имя своего учителя, а теперь Teacher
  //хранит список своих студентов, теперь наши объекты знают друг о друге

  public Teacher(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}

class Student {
  private String name;
  private Teacher teacher; // связь через поле (ассоциация)

  public Student(String name, Teacher teacher) {
    this.name = name;
    this.teacher = teacher; // студент знает учителя
  }

  public void info() {
    System.out.println(name + " учится у " + teacher.getName());
  }
}

public class MainAssociation {
  public static void main(String[] args) {
    Teacher t = new Teacher("Иван Иванов");
    Student s = new Student("Петя", t);
    s.info();
  }
}
