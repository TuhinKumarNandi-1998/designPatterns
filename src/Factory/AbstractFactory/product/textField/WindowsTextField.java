package Factory.AbstractFactory.product.textField;

public class WindowsTextField implements TextField {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Rendering Windows-style text field with system font");
    }

    @Override
    public void setText(String text) {
        this.text = text;
        System.out.println("Windows text field updated: " + text);
    }

    @Override
    public String getText() {
        return text;
    }
}
