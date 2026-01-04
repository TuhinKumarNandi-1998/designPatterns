package Factory.AbstractFactory.product.checkBox;

public class WindowsCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("Rendering Windows-style checkbox with system colors");
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
        System.out.println("Windows checkbox " + (checked ? "checked" : "unchecked"));
    }

    @Override
    public boolean isChecked() {
        return checked;
    }
}
