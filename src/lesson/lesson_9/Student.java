package lesson.lesson_9;

import java.util.Objects;

public class Student {
  private String name;
  private int age;
  private int courseNumber;
  private boolean duty;

  public Student(String name, int age, int courseNumber, boolean duty) {
    this.name = name;
    this.age = age;
    this.courseNumber = courseNumber;
    this.duty = duty;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getCourseNumber() {
    return courseNumber;
  }

  public boolean isDuty() {
    return duty;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setCourseNumber(int courseNumber) {
    this.courseNumber = courseNumber;
  }

  public void setDuty(boolean duty) {
    this.duty = duty;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age && courseNumber == student.courseNumber && duty == student.duty && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, courseNumber, duty);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", courseNumber=" + courseNumber +
            ", duty=" + duty +
            '}';
  }
}
