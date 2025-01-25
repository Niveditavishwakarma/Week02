package onlineretailorder;

public class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus(){
        return "Order placed on " + orderDate;
    }

    public void displayOrderDetails(){
        System.out.println("Order ID: " + orderId );
        System.out.println("order date: " + orderDate);
    }
}
