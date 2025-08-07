package org.example.MacOS;

import org.example.GUIComponents.Button;
import org.example.GUIComponents.CheckBox;
import org.example.GUIComponents.ScrollBar;
import org.example.GUIFactory;

public class MacOSFactory implements GUIFactory {
    private final Button button = new MacOSButton();
    private final CheckBox checkBox = new MacOSCheckBox();
    private final ScrollBar scrollBar = new MacOSScrollBar();

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
