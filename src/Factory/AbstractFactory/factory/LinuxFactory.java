package Factory.AbstractFactory.factory;

// Create concrete factories for each platform

import Factory.AbstractFactory.product.button.Button;
import Factory.AbstractFactory.product.button.LinuxButton;
import Factory.AbstractFactory.product.checkBox.Checkbox;
import Factory.AbstractFactory.product.checkBox.LinuxCheckbox;
import Factory.AbstractFactory.product.textField.LinuxTextField;
import Factory.AbstractFactory.product.textField.TextField;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
