package Factory.FactoryMethod;

// Configuration class to choose logistics type

public class LogisticsConfigurator {
    public static Logistics getLogistics(String type) {
        return switch (type.toLowerCase()) {
            case "road" -> new RoadLogistics();
            case "sea" -> new SeaLogistics();
            case "air" -> new AirLogistics();
            case "rail" -> new RailLogistics();
            default -> throw new IllegalArgumentException("Unknown logistics type: " + type);
        };
    }

    // Smart configurator based on distance and budget
    public static Logistics getLogisticsByRequirements(double distance, double budget) {
        double budgetPerKm = budget / distance;

        if (budgetPerKm >= 5.0) {
            System.out.println("Budget allows for air transport");
            return new AirLogistics();
        } else if (budgetPerKm >= 2.5) {
            System.out.println("Budget suitable for road transport");
            return new RoadLogistics();
        } else if (budgetPerKm >= 1.8) {
            System.out.println("Budget suitable for rail transport");
            return new RailLogistics();
        } else {
            System.out.println("Budget requires sea transport");
            return new SeaLogistics();
        }
    }
}
