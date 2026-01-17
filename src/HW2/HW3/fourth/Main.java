package HW2.HW3.fourth;

import HW2.HW3.first.NewThread;

public class Main {
  public static void main(String[] args){
    StringBuilder mySymbol = new StringBuilder("a");
    NewThread2 newThread1 = new NewThread2(mySymbol);
    NewThread2 newThread2 = new NewThread2(mySymbol);
    NewThread2 newThread3 = new NewThread2(mySymbol);

    newThread1.start();
    newThread2.start();
    newThread3.start();
  }
}
