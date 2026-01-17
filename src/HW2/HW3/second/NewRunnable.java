package HW2.HW3.second;

public class NewRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 10 == 0){
        System.out.println(Thread.currentThread().getName() + " " + i);
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
