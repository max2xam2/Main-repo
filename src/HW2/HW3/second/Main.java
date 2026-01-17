package HW2.HW3.second;

public class Main {
  public static void main(String[] args){
    Thread thread1 = new Thread(new NewRunnable());
    Thread thread2 = new Thread(new NewRunnable());
    Thread thread3 = new Thread(new NewRunnable());
    thread1.start();
    thread2.start();
    thread3.start();
  }
}
