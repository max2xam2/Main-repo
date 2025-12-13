package lesson.lesson_8;

@FunctionalInterface
public interface Car {
  void signal(int a); //только один всегда

  default void run() {
  }//много
}
