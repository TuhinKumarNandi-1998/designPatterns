package Factory.AbstractFactory.factory;

// Create concrete factories for each platform

import Factory.AbstractFactory.product.button.Button;
import Factory.AbstractFactory.product.button.WindowsButton;
import Factory.AbstractFactory.product.checkBox.Checkbox;
import Factory.AbstractFactory.product.checkBox.WindowsCheckbox;
import Factory.AbstractFactory.product.textField.TextField;
import Factory.AbstractFactory.product.textField.WindowsTextField;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
