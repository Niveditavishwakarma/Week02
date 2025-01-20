public class ShoppingCart
{
	public static void main(String args[])
	{
		// Create Product objects
        Product product1 = new Product("Laptop", 50000, 2);
        Product product2 = new Product("Smartphone", 30000, 3);

        // Use instanceof to check object type
        if (product1 instanceof Product) {
            product1.displayDetails();  
        }

        if (product2 instanceof Product) {
            product2.displayDetails();  
        }

        // Update the discount globally
        Product.updateDiscount(15.0);

        // Display product details after discount update
        System.out.println("After updating discount to 15%:");
        if (product1 instanceof Product) {
            product1.displayDetails();  
        }

        if (product2 instanceof Product) {
            product2.displayDetails(); 
        }
	}
}
class Product {
    
    static double discount = 10.0; 

    // Instance variables
    String productName;
    double price;
    int quantity;
	
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage for all products
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price after discount: " + (price - (price * discount / 100)) * quantity);
        System.out.println();
    }
}

