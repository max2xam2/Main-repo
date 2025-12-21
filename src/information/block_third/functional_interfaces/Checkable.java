package information.block_third.functional_interfaces;

@FunctionalInterface
public interface Checkable<T> {
  boolean check(T t);
}
