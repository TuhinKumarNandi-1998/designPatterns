package Factory.AbstractFactory.product.checkBox;

// Create concrete products for Linux

public class LinuxCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("Rendering Linux-style checkbox with GTK styling");
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
        System.out.println("Linux checkbox " + (checked ? "checked" : "unchecked"));
    }

    @Override
    public boolean isChecked() {
        return checked;
    }
}
