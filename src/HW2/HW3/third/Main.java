package HW2.HW3.third;

import HW2.HW3.second.NewRunnable;

public class Main {
  public static void main(String[] args){
    char symbol = 'a';
    Thread thread1 = new Thread(new NewRunnable2(symbol));
    Thread thread2 = new Thread(new NewRunnable2(symbol));
    Thread thread3 = new Thread(new NewRunnable2(symbol));
    thread1.start();
    thread2.start();
    thread3.start();
  }
}
