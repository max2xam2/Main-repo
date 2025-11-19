package HW.HW2.aggregation_composition.Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
  private String name;

  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}

class Storage{
  private String title;
  private List<Product> products = new ArrayList<>();

  public Storage(String title, List<Product> products){
    this.title = title;
    this.products = products;
  }

  public void printProducts(){
    for(Product product : products){
      System.out.println(product.getName() + " " + product.getPrice());
    }
  }

  public void addProduct(Product product){
    products.add(product);
  }

}

public class Main {
  public static void main(String[] args){
    Product productFirst = new Product("Potato", 123);
    Product productSecond = new Product("Tomato", 28374);
    Product productThird = new Product("Apple", 213);
    List<Product> product = Arrays.asList(productFirst, productSecond, productThird);
    Storage storageFirst = new Storage("MMM", product);
    Storage storageSecond = new Storage("7Eleven", product);
    storageFirst.printProducts();
    storageSecond.printProducts();
//  storageSecond = null;
    storageSecond.printProducts();
//    for(Product p : product){
//      System.out.println(p.getName() + " " + p.getPrice());
//    }
  }
}

/*Является агрегацией, потому что в магазин уже передается готовый набор продуктов, который мы можем только
* пополнять, и один и тот же набор продуктов могут быть переданы в разные магазины. После удаления магазина
* набор продуктов доступен к работе.*/
