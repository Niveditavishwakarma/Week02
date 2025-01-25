package onlineretailorder;

public class Main {
    public static void main(String args[])
    {
        Order order = new Order("ORD12345","2025-02-20");

        ShippedOrder shippedOrder = new ShippedOrder("ORD12345","2025-02-20","TRACK9876");

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD12345","2025-02-20","TRACK9876","2025-02-25");

        System.out.println("------Order Details------");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("\n------Shipped order Details---------");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: "+ shippedOrder.getOrderStatus());

        System.out.println("\n--------Delivered Order Details-------");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: "+ deliveredOrder.getOrderStatus());


    }
}
