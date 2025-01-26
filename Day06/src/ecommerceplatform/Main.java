package ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void calculateAndPrintFinalPrice(List<Product> products) {
        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable)
            {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }
            double finalPrice = price + tax - discount;
            System.out.println("Product name: "+ product.getName());
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("E001","Smartphone",50000));
        products.add(new Clothing("C001","T-shirt",1000));
        products.add(new Groceries("G001","Rice",500));

        calculateAndPrintFinalPrice(products);
    }
}
