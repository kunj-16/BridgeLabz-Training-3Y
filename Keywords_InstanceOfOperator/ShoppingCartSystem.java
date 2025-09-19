class Product {
    private static double discount = 10.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            double totalPrice = price * quantity;
            double discountedPrice = totalPrice - (totalPrice * discount / 100);
            System.out.println("Product ID   : " + this.productID);
            System.out.println("Product Name : " + this.productName);
            System.out.println("Price        : " + this.price);
            System.out.println("Quantity     : " + this.quantity);
            System.out.println("Total Price  : " + totalPrice);
            System.out.println("Discounted   : " + discountedPrice);
        } else {
            System.out.println("Invalid object - not a Product instance.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000, 1, "P101");
        Product p2 = new Product("Headphones", 2000, 2, "P102");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println("\nUpdating discount to 20%...\n");
        Product.updateDiscount(20);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}
