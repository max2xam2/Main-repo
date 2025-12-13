package lesson.lesson_9;


@FunctionalInterface
public interface Checkable<T> {
  boolean check(T t, int e);
}
