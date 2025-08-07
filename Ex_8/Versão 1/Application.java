package org.example;

import org.example.GUIComponents.CheckBox;
import org.example.GUIComponents.Button;
import org.example.GUIComponents.ScrollBar;

public class Application {
    private Button button;
    private CheckBox checkBox;
    private ScrollBar scrollBar;

    Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
        scrollBar = guiFactory.createScrollBar();
    }

    public void renderUI() {
        button.paint();
        checkBox.paint();
        scrollBar.paint();
    }

}
