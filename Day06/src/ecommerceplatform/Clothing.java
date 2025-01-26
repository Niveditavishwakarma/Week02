package ecommerceplatform;

 class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
         super(productId, name, price);
     }

     @Override
     public double calculateDiscount(){
        return getPrice() * 0.2;
     }

     @Override
     public double calculateTax(){
        return getPrice() * 0.5;
     }

     @Override
     public String getTaxDetails(){
        return "5% GST applicable on Clothing.";
     }

 }
