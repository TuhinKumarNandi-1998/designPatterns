package Factory.FactoryMethod;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[SeaLogistics] Creating ship transport...");
        return new Ship();
    }
}
