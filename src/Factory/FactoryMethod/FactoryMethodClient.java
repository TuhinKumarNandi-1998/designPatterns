package Factory.FactoryMethod;

import Factory.FactoryMethod.creator.*;
import Factory.FactoryMethod.util.LogisticsConfigurator;

public class FactoryMethodClient {

    /**
     * In Factory Method, instead of having one factory class that knows about all products,
     * you have a creator hierarchy where each subclass creates its own specific product.
     * Think of it as: "Don't call us to create objects, we'll create them ourselves!"
     **/

    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern Demo ===");

        // Example 1: Using different logistics types
        System.out.println("\n--- Road Logistics ---");
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery("New York", "Boston", 350);

        System.out.println("\n--- Sea Logistics ---");
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery("Shanghai", "Los Angeles", 10000);

        System.out.println("\n--- Air Logistics ---");
        Logistics airLogistics = new AirLogistics();
        airLogistics.planDelivery("London", "Dubai", 5500);

        System.out.println("\n--- Rail Logistics ---");
        Logistics railLogistics = new RailLogistics();
        railLogistics.planDelivery("Berlin", "Moscow", 1800);

        // Example 2: Using configurator
        System.out.println("\n\n=== Using Configurator ===");
        Logistics configuredLogistics = LogisticsConfigurator.getLogistics("sea");
        configuredLogistics.planDelivery("Mumbai", "Sydney", 9500);

        // Example 3: Smart configuration based on requirements
        System.out.println("\n\n=== Smart Configuration Based on Budget ===");

        double distance = 1000;
        double budget = 2000;

        System.out.println("Requirements: " + distance + " km, Budget: $" + budget);
        Logistics smartLogistics = LogisticsConfigurator.getLogisticsByRequirements(distance, budget);
        smartLogistics.planDelivery("Chicago", "Miami", distance);

        // Example 4: Express logistics with conditional logic
        System.out.println("\n\n=== Express Logistics ===");

        Logistics expressStandard = new ExpressLogistics(false);
        expressStandard.planDelivery("San Francisco", "Seattle", 1300);

        Logistics expressPriority = new ExpressLogistics(true);
        expressPriority.planDelivery("Tokyo", "Seoul", 1200);

        // Example 5: Demonstrating polymorphism
        System.out.println("\n\n=== Demonstrating Polymorphism ===");
        Logistics[] allLogistics = {
                new RoadLogistics(),
                new SeaLogistics(),
                new AirLogistics(),
                new RailLogistics()
        };

        for (Logistics logistics : allLogistics) {
            logistics.optimizeRoute();
        }
    }
}
