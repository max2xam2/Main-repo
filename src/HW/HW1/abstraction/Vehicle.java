package abstraction;

public abstract class Vehicle{

  protected String brand;
  protected int forces;
  static int countCall;
  static int countObject;

  abstract void start();

  protected Vehicle(String brand){
    this.brand = brand;
  }

  protected Vehicle(String brand, int forces){
    this(brand);
    this.forces = forces;
    countCall++;
    countObject++;
  }
}

class Car extends Vehicle{

  Car(String name){
    super(name);
  }

  Car(String newName, int newForces){
    super(newName, newForces);
  }

  @Override
  void start(){
    System.out.println("Car start " + brand + " " + forces + " CountCall = " + countCall + " and CountObject= " + countObject);
  }
}

class Motorbyke extends Vehicle{

  Motorbyke(String name, int forces){
    super(name, forces);
  }

  @Override
  void start() {
    System.out.println("Motorbyke start " + " CountCall = " + countCall + " and CountObject= " + countObject);
  }
}