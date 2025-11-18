package information.block_second.composition_agragation;

/*Это уже является композицией, потому что мы создаем новые комнаты только в House и они не могут существовать
* вне дома. */

class Room {
  private String name;

  public Room(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

class House {
  private Room kitchen;
  private Room livingRoom;

  public House() {
    // комнаты создаются внутри дома → композиция
    this.kitchen = new Room("Кухня");
    this.livingRoom = new Room("Гостиная");
  }

  public void info() {
    System.out.println("Дом содержит: " + kitchen.getName() + " и " + livingRoom.getName());
  }
}

public class MainComposition {
  public static void main(String[] args) {
    House house = new House();
    house.info();
  }
}
