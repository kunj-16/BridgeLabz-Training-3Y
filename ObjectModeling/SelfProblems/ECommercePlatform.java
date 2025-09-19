import java.util.ArrayList;
import java.util.List;

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

class Order {
    private int orderId;
    private List<Product> products;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " ($" + p.getPrice() + ")");
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order);
    }

    public void viewOrders() {
        System.out.println("\nCustomer: " + name + " has placed the following orders:");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Headphones", 50);
        Product p3 = new Product("Smartphone", 600);
        Product p4 = new Product("Charger", 20);

        Customer c1 = new Customer("Kunj");

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);
        o2.addProduct(p4);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.viewOrders();
    }
}
