package HW.HW4.Task5;

public class Main {

  enum OrderStatus{
    PENDING, CONFIRMED, SHIPPED, DELIVERED, CANCELLED
  }

  static class Order {
    OrderStatus orderStatus;

    public Order(OrderStatus orderStatus){
      this.orderStatus = orderStatus;
    }

    public void nextStatus(Order order){
      switch(order.orderStatus){
        case PENDING:
          order.orderStatus = OrderStatus.CONFIRMED;
          break;
        case CONFIRMED:
          order.orderStatus = OrderStatus.SHIPPED;
          break;
        case SHIPPED:
          order.orderStatus = OrderStatus.DELIVERED;
          break;
        case DELIVERED:
          System.out.println("Thank for your order!");
      }
    }
  }

  public static void main(String[] args){
    Order order = new Order(OrderStatus.PENDING);
    order.nextStatus(order); //как-то странно, странно
    System.out.println(order.orderStatus);
  }
}
