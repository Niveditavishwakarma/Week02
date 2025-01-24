import java.util.ArrayList;
import java.util.List;

public class ShoppingSystem {
    public static void main(String[] args) {
 
        Customer customer = new Customer("John Doe");

        customer.purchaseProduct(new Product("ASUSLaptop", 1200.50));
        customer.purchaseProduct(new Product("Smartphone", 799.99));
        customer.purchaseProduct(new Product("Headphones", 149.75));

        BillGenerator.generateBill(customer);
    }
}


class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private List<Product> purchasedProducts;

    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }

    public void purchaseProduct(Product product) {
        purchasedProducts.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
}

class BillGenerator {

    public static double calculateTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getPurchasedProducts()) {
            total += product.getPrice();
        }
        return total;
    }

    public static void generateBill(Customer customer) {
        System.out.println("Bill for Customer: " + customer.getName());
        System.out.println("------------------------------------------------");
        System.out.println("Product Name\t\tPrice");

        for (Product product : customer.getPurchasedProducts()) {
            System.out.println(product.getProductName() + "\t\t" + product.getPrice());
        }

        double total = calculateTotal(customer);
        System.out.println("------------------------------------------------");
        System.out.println("Total Amount: " + total);
    }
}

