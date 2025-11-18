package information.block_second.composition_agragation;

import java.util.*;

class StudentInfo {
  private String name;

  public StudentInfo(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

/*Студент имеет поле имени, конструктор для инициализации и геттер*/

class Classroom {
  private String roomName;
  private List<StudentInfo> students = new ArrayList<>();

  public Classroom(String roomName) {
    this.roomName = roomName;
  }


//  public class ClassroomComposition(String roomName){
//    this.roomName = roomName;
//    students.addStudent(new StudentInfo("Sergey"));
//  } -- вот это уже явялется композицией, потому что студенты создаются и добавляются в список вместе с классом

  public void addStudent(StudentInfo s) {
    students.add(s);
  }

  public void showStudents() {
    System.out.println("В классе " + roomName + " учатся:");
    for (StudentInfo s : students) {
      System.out.println(s.getName());
    }
  }
}

/*Classrom хрнаит в себе название комнаты и список студентов, также есть метод для добавления новых студентов
* в список. Класс содержит студентов, но студенты могут существовать и сами. Чтобы это стало композицией, нужно было
* в конструкторе Classroom создавать также студентов, чтобы они не могли существовать вне этого класса. */

public class MainAggragation {
  public static void main(String[] args) {
    StudentInfo s1 = new StudentInfo("Аня");
    StudentInfo s2 = new StudentInfo("Борис");

    Classroom c = new Classroom("101");
    c.addStudent(s1);
    c.addStudent(s2);
    //просто добавляем новых студентов в список
    c.showStudents();

    // Студенты существуют независимо от класса
    System.out.println("Студент вне класса: " + s1.getName());
  }
}

