package HW.HW2.aggregation_composition.Task9;

class Figure {

  private String name;

  Figure(String name) {
    this.name = name;
  }

  protected String getName(){
    return name;
  }

  protected void printName(String name){
    System.out.println(name);
  }

  protected void countCorner(){}

  protected void finiteNumberOfVectord(){};

  protected void usedSpace(){};

  protected void equation(){};

}
