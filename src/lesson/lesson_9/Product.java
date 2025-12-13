package lesson.lesson_9;

public class Product{
  private int price;
  private String name;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  //@Override
//  public int compareTo(Product o) {
//    return this.price - o.price;
//  }

  @Override
  public String toString() {
    return "Product{" +
            "price=" + price +
            ", name='" + name + '\'' +
            '}';
  }
}
