package information.block_third.thread;

/*какие есть виды потоков,*/

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(()->{
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + ":" + i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });
    thread.start();

    thread.join();
    System.out.println("END");
  }
}
