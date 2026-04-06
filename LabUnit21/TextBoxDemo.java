package LabUnit21;

import java.awt.*;

public class TextBoxDemo extends Frame {
    TextBoxDemo() {
        TextField t1 = new TextField("Type here...", 20);
        add(t1);
        setSize(300, 100);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) { new TextBoxDemo(); }
}
