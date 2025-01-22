import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 800.00);
        Product product2 = new Product("Smartphone", 500.00);
        Product product3 = new Product("Headphones", 50.00);

        Customer customer = new Customer("Alice");

        Order order1 = new Order(001);
        order1.addProduct(product1);
        order1.addProduct(product2);

        customer.placeOrder(order1);

        // Create Another Order
        Order order2 = new Order(002);
        order2.addProduct(product3);

        // Customer Places the Second Order
        customer.placeOrder(order2);

        // Display Customer's Orders and Total Bill
        System.out.println("Orders placed by " + customer.getName() + ":");
        for (Order order : customer.getOrders()) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products in the order:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
            System.out.println("Total for Order ID " + order.getOrderId() + ": $" + order.calculateTotal());
            System.out.println();
        }
    }
}

// Product Class
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

// Order Class
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return name;
    }
}

