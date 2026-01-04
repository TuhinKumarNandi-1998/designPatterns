package Factory.SimpleFactory;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 5.0; // default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
