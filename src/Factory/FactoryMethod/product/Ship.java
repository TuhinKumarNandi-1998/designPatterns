package Factory.FactoryMethod.product;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by SHIP across the ocean");
    }

    @Override
    public void pickup() {
        System.out.println("Loading cargo onto ship at port");
    }

    @Override
    public String getType() {
        return "Sea Transport";
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 1.2; // $1.2 per km (cheaper but slower)
    }
}
