package Factory.FactoryMethod;

public class Train implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by TRAIN on rail tracks");
    }

    @Override
    public void pickup() {
        System.out.println("Loading cargo onto train at station");
    }

    @Override
    public String getType() {
        return "Rail Transport";
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 1.8; // $1.8 per km
    }
}
