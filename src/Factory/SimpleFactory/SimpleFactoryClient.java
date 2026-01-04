package Factory.SimpleFactory;

import Factory.SimpleFactory.factory.ShapeFactory;
import Factory.SimpleFactory.product.Shape;

public class SimpleFactoryClient {

    /**
     * Simple Factory is NOT an official design pattern -
     * it's more of a programming idiom or a simplified approach.
     * One factory class with a static or instance method
     * Takes a parameter and returns different objects based on that parameter
     * Not a GoF pattern, but widely used
     **/

    public static void main(String[] args) {
        System.out.println("=== Simple Factory Pattern Demo ===\n");

        // Create shapes using factory
        Shape circle = ShapeFactory.createShape("circle");
        Shape rectangle = ShapeFactory.createShape("rectangle");
        Shape triangle = ShapeFactory.createShape("triangle");

        // Use the shapes
        circle.draw();
        System.out.println("Area: " + circle.calculateArea() + "\n");

        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea() + "\n");

        triangle.draw();
        System.out.println("Area: " + triangle.calculateArea() + "\n");

        // Create shapes with custom parameters
        System.out.println("=== Custom Parameters ===\n");

        Shape customCircle = ShapeFactory.createShape("circle", 10.0);
        Shape customRectangle = ShapeFactory.createShape("rectangle", 8.0, 12.0);
        Shape customTriangle = ShapeFactory.createShape("triangle", 6.0, 9.0);

        customCircle.draw();
        System.out.println("Area: " + customCircle.calculateArea() + "\n");

        customRectangle.draw();
        System.out.println("Area: " + customRectangle.calculateArea() + "\n");

        customTriangle.draw();
        System.out.println("Area: " + customTriangle.calculateArea() + "\n");

        // Demonstrate error handling
        try {
            Shape invalidShape = ShapeFactory.createShape("hexagon");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
