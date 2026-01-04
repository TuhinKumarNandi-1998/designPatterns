package Factory.FactoryMethod;

public class RailLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[RailLogistics] Creating train transport...");
        return new Train();
    }
}
