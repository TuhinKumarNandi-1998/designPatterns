package Factory.FactoryMethod.creator;

import Factory.FactoryMethod.product.Train;
import Factory.FactoryMethod.product.Transport;

public class RailLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[RailLogistics] Creating train transport...");
        return new Train();
    }
}
