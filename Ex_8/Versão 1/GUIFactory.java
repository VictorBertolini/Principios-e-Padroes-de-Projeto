package org.example;

import org.example.GUIComponents.Button;
import org.example.GUIComponents.CheckBox;
import org.example.GUIComponents.ScrollBar;

public interface GUIFactory{
    public Button createButton();
    public CheckBox createCheckBox();
    public ScrollBar createScrollBar();
}
