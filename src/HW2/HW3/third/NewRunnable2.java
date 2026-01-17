package HW2.HW3.third;

public class NewRunnable2 implements Runnable {
  private static char args; //так после каждого потока будет обновляться, без него нет

  public NewRunnable2(char args){
    this.args = args;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i ++) {
      System.out.println(Thread.currentThread().getName() + " " + args);
    }
    args++;
  }
}
