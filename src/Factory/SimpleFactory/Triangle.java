package Factory.SimpleFactory;

public class Triangle implements Shape {
    private double base, height;

    public Triangle() {
        this.base = 4.0;
        this.height = 3.0;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle: base=" + base + ", height=" + height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
