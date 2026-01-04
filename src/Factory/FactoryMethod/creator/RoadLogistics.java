package Factory.FactoryMethod.creator;

// Create concrete creators (each decides which product to create)

import Factory.FactoryMethod.product.Transport;
import Factory.FactoryMethod.product.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[RoadLogistics] Creating truck transport...");
        return new Truck();
    }
}
