package Factory.FactoryMethod;

public class ExpressLogistics extends Logistics {
    private boolean isPriority;

    public ExpressLogistics(boolean isPriority) {
        this.isPriority = isPriority;
    }

    @Override
    public Transport createTransport() {
        if (isPriority) {
            System.out.println("[ExpressLogistics] Priority delivery - Creating airplane...");
            return new Airplane();
        } else {
            System.out.println("[ExpressLogistics] Standard express - Creating truck...");
            return new Truck();
        }
    }
}
