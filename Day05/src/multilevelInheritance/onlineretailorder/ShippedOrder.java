package onlineretailorder;

public class ShippedOrder extends Order{
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus(){
        return super.getOrderStatus() +  " | shipped with tracking number :" + trackingNumber;
    }

    @Override
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Tracking number: " + trackingNumber);
    }
}
