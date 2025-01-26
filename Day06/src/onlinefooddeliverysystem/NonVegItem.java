package onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private double discountRate;
    private static final double additional_charge = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additional_charge;
    }

    @Override
    public void applyDiscount(double discountRate) {
        this.discountRate = discountRate;
        double discountedPrice = getPrice() - (getPrice() * discountRate / 100);
        setPrice(discountedPrice);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Rate: " + discountRate + "%";
    }
}
