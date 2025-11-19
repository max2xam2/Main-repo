package HW.HW2.aggregation_composition;

/*Это является композицией, а не агрегацией потому что мы создаем объект Engine внутри Car, а не передаем его туда.
* Если мы удаляем объект Car, то и удаляется сразу же наш Engine, так как он был создан внутри Car. То есть
* часть без целого жить не может.*/

class Engine{
  private String name;

  public Engine(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
}

class Car {
  private String brand;
  private Engine engine;

  public Car(String brand, String engineName){ //передаем String engineName, а не объект Engine(иначе это была бы уже агр)
    this.brand = brand;
    this.engine = new Engine(engineName);
  }

  public String getBrand(){
    return brand;
  }
  public Engine getEngine(){
    return engine;
  }

}

public class Task1 {
  public static void main(String[] args){
    Car carFirst = new Car("mercedes", "gls");
    System.out.println(carFirst.getBrand());
  }
}
