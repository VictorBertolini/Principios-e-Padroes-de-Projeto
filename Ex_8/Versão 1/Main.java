package org.example;

import org.example.MacOS.MacOSFactory;
import org.example.Windows.WindowsFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Teste
// Pode alterar a classe abaixo para forçar a Application usar uma MacOSFactory;
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new WindowsFactory();
//        factory = new MacOSFactory();
        Application app = new Application(factory);
        app.renderUI();
    }
}