package onlinefooddeliverysystem;

import java.util.*;
public class Main {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10.0);
                System.out.println(discountableItem.getDiscountDetails());
                System.out.println("Price after Discount: " + item.calculateTotalPrice());
            }

            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200.0, 2));
        order.add(new NonVegItem("Chicken Biryani", 350.0, 3));

        System.out.println("Online Food Delivery System");
        processOrder(order);
    }
}
