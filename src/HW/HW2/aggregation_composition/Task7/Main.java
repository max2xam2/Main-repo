package HW.HW2.aggregation_composition.Task7;

class Monitor{
  private String name;

  public Monitor(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

class SystemUnit{
  private String name;
  private int power;

  public SystemUnit(String name, int power){
    this.name = name;
    this.power = power;
  }

  public void getNamePower(){
    System.out.println(this.name + this.power);
  }
}

class Keyboard{
  private String name;
  private String type;

  public Keyboard(String name, String type){
    this.name = name;
    this.type = type;
  }
}

class Computer{
  String name;
  private final Monitor monitor; //можно ли так делать? как будто бы да, потому что мы не сможем ничего сделать с
  //монитором отдельно и этим самым покажем,что его существование вне компа невозможно
  private SystemUnit systemUnit;
  private Keyboard keyboard;

  public Computer(String name){
    this.monitor = new Monitor("Acer");
    this.systemUnit = new SystemUnit("Aerocool", 650);
    this.keyboard = new Keyboard("HyperX", "mechanical");
    this.name = name;
  }

  public void infoDisplay(){
    System.out.println(monitor.getName());
  }
}

public class Main {
  public static void main(String[] args) {
    Computer computer = new Computer("work");
    computer.infoDisplay();
    computer = null;
    computer.infoDisplay();
  }
}

/*Связь между объектами явялется композицией, потому что монитор, системный блок и клавиатура являются частью
* компьютера, они создаются в тот же момент, когда мы создаем и сам компьютер, строка 61 - выведет Acer,
* а строка 63 выдаст ошибку "Cannot invoke "HW.HW2.aggregation_composition.Task7.Computer.infoDisplay()"
* because "computer" is null", потому что мы удалили ссылку на компьютер(null), соответственно и монитор закончил
* свой жизненый цикл. Точно ли верно я все здесь описал?*/
