package Factory.FactoryMethod;

// Create concrete creators (each decides which product to create)

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[RoadLogistics] Creating truck transport...");
        return new Truck();
    }
}
