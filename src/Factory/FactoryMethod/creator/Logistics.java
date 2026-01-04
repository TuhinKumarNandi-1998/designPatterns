package Factory.FactoryMethod.creator;

// Create the Creator abstract class with factory method

import Factory.FactoryMethod.product.Transport;

public abstract class Logistics {
    // This is the Factory Method - subclasses will override this
    public abstract Transport createTransport();

    // Template method that uses the factory method
    public void planDelivery(String from, String to, double distance) {
        System.out.println("\n=== Planning Delivery ===");
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Distance: " + distance + " km");

        // Call the factory method to get the transport
        Transport transport = createTransport();

        System.out.println("Transport Type: " + transport.getType());
        System.out.println("Estimated Cost: $" + transport.calculateCost(distance));

        transport.pickup();
        transport.deliver();

        System.out.println("Delivery completed successfully!");
    }

    // Additional business logic that works with any transport
    public void optimizeRoute() {
        Transport transport = createTransport();
        System.out.println("Optimizing route for " + transport.getType());
    }
}
