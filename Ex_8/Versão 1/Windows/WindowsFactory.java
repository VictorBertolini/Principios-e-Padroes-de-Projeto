package org.example.Windows;

import org.example.GUIComponents.Button;
import org.example.GUIComponents.CheckBox;
import org.example.GUIComponents.ScrollBar;
import org.example.GUIFactory;

public class WindowsFactory implements GUIFactory {
    private final WindowsButton button = new WindowsButton();
    private final WindowsCheckBox checkBox = new WindowsCheckBox();
    private final WindowsScrollBar scrollBar = new WindowsScrollBar();

    @Override
    public Button createButton() {
        return button;
    }

    @Override
    public CheckBox createCheckBox() {
        return checkBox;
    }

    @Override
    public ScrollBar createScrollBar() {
        return scrollBar;
    }
}
