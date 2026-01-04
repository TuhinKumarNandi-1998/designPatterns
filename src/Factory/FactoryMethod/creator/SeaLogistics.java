package Factory.FactoryMethod.creator;

import Factory.FactoryMethod.product.Ship;
import Factory.FactoryMethod.product.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[SeaLogistics] Creating ship transport...");
        return new Ship();
    }
}
