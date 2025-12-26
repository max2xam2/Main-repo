package lesson.newppp;

public class Main {
  public static void main(String[] args) {
    A newA = new B();
    if(newA instanceof B newB) //нисходящее наследование
    {
      //B newB = (B)newA;
      newB.print();
    }
  }
}
