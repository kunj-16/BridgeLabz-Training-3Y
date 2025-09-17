class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order initialOrder = new Order("A123", "2025-09-15");
        ShippedOrder shippedOrder = new ShippedOrder("B456", "2025-09-16", "TRK789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("C789", "2025-09-17", "TRK1011", "2025-09-20");

        System.out.println("--- Order Status Hierarchy ---");
        System.out.println("Order ID: " + initialOrder.getOrderId() + " -> Status: " + initialOrder.getOrderStatus());
        System.out.println("Order ID: " + shippedOrder.getOrderId() + " -> Status: " + shippedOrder.getOrderStatus());
        System.out.println("Order ID: " + deliveredOrder.getOrderId() + " -> Status: " + deliveredOrder.getOrderStatus());
        System.out.println("\n--- Detailed Order Information ---");
        initialOrder.displayOrderDetails();
        System.out.println("\n--- Shipped Order Information ---");
        shippedOrder.displayOrderDetails();
        System.out.println("\n--- Delivered Order Information ---");
        deliveredOrder.displayOrderDetails();
    }
}