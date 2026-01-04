package Factory.FactoryMethod;

// Create concrete products

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by TRUCK on the road");
    }

    @Override
    public void pickup() {
        System.out.println("Picking up cargo with truck from warehouse");
    }

    @Override
    public String getType() {
        return "Road Transport";
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 2.5; // $2.5 per km
    }
}
