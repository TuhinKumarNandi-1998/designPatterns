package Factory.AbstractFactory.product.button;

// Create concrete products for Linux

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Linux-style button with GTK theme");
    }

    @Override
    public void onClick() {
        System.out.println("Linux button clicked - X11 event handled");
    }
}
