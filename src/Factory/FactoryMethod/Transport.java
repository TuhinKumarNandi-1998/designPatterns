package Factory.FactoryMethod;

// Define the Product interface

public interface Transport {
    void deliver();
    void pickup();
    String getType();
    double calculateCost(double distance);
}
