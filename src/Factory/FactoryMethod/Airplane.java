package Factory.FactoryMethod;

public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by AIRPLANE through the air");
    }

    @Override
    public void pickup() {
        System.out.println("Loading cargo onto airplane at airport");
    }

    @Override
    public String getType() {
        return "Air Transport";
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 5.0; // $5 per km (expensive but fast)
    }
}
