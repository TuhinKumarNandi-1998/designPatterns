package Factory.AbstractFactory.util;

// Factory Provider (optional) - helps choose the right factory

import Factory.AbstractFactory.factory.GUIFactory;
import Factory.AbstractFactory.factory.LinuxFactory;
import Factory.AbstractFactory.factory.MacFactory;
import Factory.AbstractFactory.factory.WindowsFactory;

public class GUIFactoryProvider {
    public static GUIFactory getFactory(String osType) {
        return switch (osType.toLowerCase()) {
            case "windows" -> new WindowsFactory();
            case "mac" -> new MacFactory();
            case "linux" -> new LinuxFactory();
            default -> throw new IllegalArgumentException("Unsupported OS: " + osType);
        };
    }

    // Automatically detect OS and return appropriate factory
    public static GUIFactory getFactoryForCurrentOS() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            return new WindowsFactory();
        } else if (os.contains("mac")) {
            return new MacFactory();
        } else if (os.contains("linux") || os.contains("unix")) {
            return new LinuxFactory();
        } else {
            // Default to Windows if OS is not recognized
            return new WindowsFactory();
        }
    }
}
