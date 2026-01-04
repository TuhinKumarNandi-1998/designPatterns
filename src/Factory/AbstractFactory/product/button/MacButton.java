package Factory.AbstractFactory.product.button;

// Create concrete products for Mac

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac-style button with rounded corners");
    }

    @Override
    public void onClick() {
        System.out.println("Mac button clicked - Cocoa event handled");
    }
}
