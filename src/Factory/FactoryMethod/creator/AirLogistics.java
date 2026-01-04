package Factory.FactoryMethod.creator;

import Factory.FactoryMethod.product.Airplane;
import Factory.FactoryMethod.product.Transport;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[AirLogistics] Creating airplane transport...");
        return new Airplane();
    }
}
