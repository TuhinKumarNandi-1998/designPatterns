package Factory.AbstractFactory.product.textField;

// Create concrete products for Mac

public class MacTextField implements TextField {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Rendering Mac-style text field with Helvetica font");
    }

    @Override
    public void setText(String text) {
        this.text = text;
        System.out.println("Mac text field updated: " + text);
    }

    @Override
    public String getText() {
        return text;
    }
}
