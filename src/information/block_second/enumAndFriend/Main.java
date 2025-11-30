package information.block_second.enumAndFriend;

/*Enum - тип, разрешенные значения которых состоят из фиксированного набора констант, используются для
* определения некоторого ограниченного набора значений. Enum могут иметь поля, конструкторы(чаще всего делаются
* private, это гарантирует, что все константы создаются только внутри класса enum, protected - нельзя, потому что
* тогда при наследовании подклассы могли создавать бы новые объекты, но от enum наследоваться нельзя. Также могут
* реализовывать абстрактные методы, обычные методы и статические методы. При инициализации public enum DAY {SY,MY,TY}
* Когда создается enum, JVM создает эти объекты в том порядке, в котором они объявлены в коде. Каждому enum из набора
* присваивается целочисленный индекс начиная с 0 - его можно получить с помощью ordinal(). name() - поле, переданное
* конструктору в Enum, этот метод возвращает имя константы точно так же, как оно и написано в коде, ordinal() - лучше
* не использоваться как ID, потому что например при перемешивании констант логика программы тоже изменится.*/

/*
*   enum daysOfTheWeek{
    SUNDAY, MONDAY,FRIDAY;
  }
  public static void main(String[] args) {
    daysOfTheWeek firstEnumDay = daysOfTheWeek.FRIDAY;

    daysOfTheWeek secondEnumDay = daysOfTheWeek.valueOf("SUNDAY");

    daysOfTheWeek thirdEnumDaty = Enum.valueOf(daysOfTheWeek.class, "MONDAY");
  } - самое обычное использование enum и перечисление
* */

/*daysOfTheWeek firstEnumDay = daysOfTheWeek.FRIDAY;
switch(firstEnumDay){
  case FRIDAY:
    sout();
    break;
  case SUNDAY:
    sout();
    break
} - использование enum для switch*/


/*Также enum могут и как любой обычный класс иметь поля и методы. Также могут иметь абстрактный класс, которые должны
быть переопределены.
*
*enum daysOfTheWeek {
    SUNDAY("birthday","sunny", true){
      @Override
      public void printInfoDay(){
        System.out.println("Hello world - SUNDAY");
      }
    },
    MONDAY("birthday","monday", true){
      @Override
      public void printInfoDay(){
        System.out.println("Hello world - MONDAY");
      }
    },
    TUESDAY("birthday","tuesday", true){
      @Override
      public void printInfoDay(){
        System.out.println("Hello world - TUESDAY");
      }
    },
    WEDNESDAY("birthday","wednesday", false){
      @Override
      public void printInfoDay(){
        System.out.println("Hello world - WEDNESDAY");
      }
    };

    private String event;
    private String weather;
    private boolean dayOff;

    private daysOfTheWeek(String event, String weather, boolean dayOff) {
      this.event = event;
      this.weather = weather;
      this.dayOff = dayOff;
    }

    public String getEvent(){
      return event;
    }

    public String getWeather(){
      return weather;
    }

    public boolean isDayOff(){
      return dayOff;
    }

    public abstract void printInfoDay();

    /*базовый метод toString() - чаще всего переопределяют, чтобы он возвращал более нужные поля и инфо
  }
*/


/*Также enum могут реализовывать интерфейсы
*   public interface interfaceDay{
    String getDay();

    String getMonth();
  }

  public enum daysOfTheWeek implements interfaceDay{
    ;

    @Override
    public String getDay() {
      return "";
    }

    @Override
    public String getMonth() {
      return "";
    }
  }
*/


/*Каждая константа в enum это singleton объект автоматически, потому что JVM гарантирует, что на одну константу - один
* объект. Реализовать Singleton через enum, когда нужна ровно одна константа, такое использование является
* потокобезопасным, потому что JVM создает enum-константы только один раз при загрузке класса.
*
*   public enum Counter {

    INSTANCE;

    private int value;

    public void setValue(int value) {
      this.value = value;
    }

    public void process() {
      System.out.println(value);
    }

  }
  Константа INSTANCE - является экземпляром класса, это гарантирует, что в любой момент времени существует !E экземпляр
  * класса

  Counter firstInstance = Counter.INSTANCE;
  Counter secondInstance = Counter.INSTANCE;
  //Обе переменные ссылаются на один и тот же объект в памяти и никаких новых объектов не создается,
  //то есть они обе указывают на один участок памяти, где хранится объект Counter, соответственно при изменении
  //значения поля одной переменной, это поле поменяется также и для второй переменной
*
*/


/*
  enum daysOfTheWeek {

    SUNDAY, MONDAY, FRIDAY, SATURDAY
  }

  public static void main(String[] args) {
    for (daysOfTheWeek days : daysOfTheWeek.values()) {//итерация по enum с помощью values()
      System.out.println(days);
    }

    daysOfTheWeek day = daysOfTheWeek.values()[0];//обращение к n элементу

    daysOfTheWeek dayOne = daysOfTheWeek.valueOf("SUNDAY");//получаем объект по имени

    System.out.println(day == dayOne);//сравнение enum true

    System.out.println(dayOne.compareTo(daysOfTheWeek.SUNDAY));//сравнение по порядку добавления 0. Показывает разницу
    //между добавления
*/


public class Main {
}
