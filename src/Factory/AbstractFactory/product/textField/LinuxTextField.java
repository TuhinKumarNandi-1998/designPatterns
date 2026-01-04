package Factory.AbstractFactory.product.textField;

public class LinuxTextField implements TextField {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Rendering Linux-style text field with system theme");
    }

    @Override
    public void setText(String text) {
        this.text = text;
        System.out.println("Linux text field updated: " + text);
    }

    @Override
    public String getText() {
        return text;
    }
}
