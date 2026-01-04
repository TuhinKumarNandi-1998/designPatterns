package Factory.SimpleFactory.product;

public class Rectangle implements Shape {
    private double width, height;

    public Rectangle() {
        this.width = 4.0;
        this.height = 6.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle: " + width + " x " + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
