package HW2.HW3.fourth;

public class NewThread2 extends Thread{
  public StringBuilder symbol;

  public NewThread2(StringBuilder symbol){
    this.symbol = symbol;
  }

  @Override
  public void run() {
    synchronized (symbol){
      for (int i = 0; i < 10; i++){
        System.out.println(Thread.currentThread().getName() + " " + symbol);
      }
      char c = symbol.charAt(0);
      c++;
      symbol.setCharAt(0,c);
    }
  }
}
