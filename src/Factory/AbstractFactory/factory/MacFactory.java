package Factory.AbstractFactory.factory;

// Create concrete factories for each platform

import Factory.AbstractFactory.product.button.Button;
import Factory.AbstractFactory.product.button.MacButton;
import Factory.AbstractFactory.product.checkBox.Checkbox;
import Factory.AbstractFactory.product.checkBox.MacCheckbox;
import Factory.AbstractFactory.product.textField.MacTextField;
import Factory.AbstractFactory.product.textField.TextField;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
