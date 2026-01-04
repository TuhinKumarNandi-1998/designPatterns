package Factory.SimpleFactory.factory;

import Factory.SimpleFactory.product.Circle;
import Factory.SimpleFactory.product.Rectangle;
import Factory.SimpleFactory.product.Shape;
import Factory.SimpleFactory.product.Triangle;

public class ShapeFactory {

    // Factory method to create shapes
    public static Shape createShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }

        return switch (shapeType.toLowerCase()) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }

    // Overloaded factory method with parameters
    public static Shape createShape(String shapeType, double... params) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }

        return switch (shapeType.toLowerCase()) {
            case "circle" -> params.length > 0 ? new Circle(params[0]) : new Circle();
            case "rectangle" -> params.length >= 2 ? new Rectangle(params[0], params[1]) : new Rectangle();
            case "triangle" -> params.length >= 2 ? new Triangle(params[0], params[1]) : new Triangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }
}
