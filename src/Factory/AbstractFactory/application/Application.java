package Factory.AbstractFactory.application;

// Application class that uses the factory

import Factory.AbstractFactory.factory.GUIFactory;
import Factory.AbstractFactory.product.button.Button;
import Factory.AbstractFactory.product.checkBox.Checkbox;
import Factory.AbstractFactory.product.textField.TextField;

public class Application {
    private Button button;
    private TextField textField;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
        checkbox = factory.createCheckbox();
    }

    public void createUI() {
        System.out.println("\n=== Creating Application UI ===");
        button.render();
        textField.render();
        checkbox.render();
    }

    public void simulateUserInteraction() {
        System.out.println("\n=== Simulating User Interaction ===");
        button.onClick();
        textField.setText("Hello, Abstract Factory!");
        System.out.println("Text field content: " + textField.getText());
        checkbox.setChecked(true);
        System.out.println("Checkbox state: " + checkbox.isChecked());
    }
}
