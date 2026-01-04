package Factory.AbstractFactory.factory;

import Factory.AbstractFactory.product.button.Button;
import Factory.AbstractFactory.product.checkBox.Checkbox;
import Factory.AbstractFactory.product.textField.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    Checkbox createCheckbox();
}
