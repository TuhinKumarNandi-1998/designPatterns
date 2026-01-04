package Factory.AbstractFactory.product.checkBox;

// Create concrete products for Mac

public class MacCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("Rendering Mac-style checkbox with smooth animations");
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
        System.out.println("Mac checkbox " + (checked ? "checked" : "unchecked"));
    }

    @Override
    public boolean isChecked() {
        return checked;
    }
}
