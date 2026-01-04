package Factory.AbstractFactory.product.button;

// Create concrete products for Windows

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows-style button with blue border");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked - native Windows event handled");
    }
}
