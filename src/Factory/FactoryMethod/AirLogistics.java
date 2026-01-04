package Factory.FactoryMethod;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        System.out.println("[AirLogistics] Creating airplane transport...");
        return new Airplane();
    }
}
