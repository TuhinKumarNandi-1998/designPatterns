package Factory.AbstractFactory;

import Factory.AbstractFactory.application.Application;
import Factory.AbstractFactory.factory.GUIFactory;
import Factory.AbstractFactory.util.GUIFactoryProvider;

public class AbstractFactoryClient {

    /**
     * The Abstract Factory Design Pattern is a creational pattern that provides an interface
     * for creating families of related or dependent objects without specifying their concrete
     * classes. Think of it as a "factory of factories" - while the Factory pattern creates
     * one type of object, the Abstract Factory creates entire families of related objects.
     */

    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern Demo ===");

        // Demo 1: Manually specify OS
        System.out.println("\n--- Windows Application ---");
        GUIFactory windowsFactory = GUIFactoryProvider.getFactory("windows");
        Application windowsApp = new Application(windowsFactory);
        windowsApp.createUI();
        windowsApp.simulateUserInteraction();

        System.out.println("\n--- Mac Application ---");
        GUIFactory macFactory = GUIFactoryProvider.getFactory("mac");
        Application macApp = new Application(macFactory);
        macApp.createUI();
        macApp.simulateUserInteraction();

        System.out.println("\n--- Linux Application ---");
        GUIFactory linuxFactory = GUIFactoryProvider.getFactory("linux");
        Application linuxApp = new Application(linuxFactory);
        linuxApp.createUI();
        linuxApp.simulateUserInteraction();

        // Demo 2: Automatically detect current OS
        System.out.println("\n--- Auto-detected OS Application ---");
        GUIFactory autoFactory = GUIFactoryProvider.getFactoryForCurrentOS();
        Application autoApp = new Application(autoFactory);
        autoApp.createUI();
        autoApp.simulateUserInteraction();

        System.out.println("\nCurrent OS: " + System.getProperty("os.name"));
    }
}
