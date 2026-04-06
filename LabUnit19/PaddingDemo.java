package LabUnit19;

import java.awt.*;

public class PaddingDemo extends Frame {
    PaddingDemo() {
        setLayout(new FlowLayout());
        add(new Button("Padded Button"));
        setSize(300, 300);
        setVisible(true);
    }

    // This creates padding around the window edges
    @Override
    public Insets getInsets() {
        return new Insets(50, 20, 20, 20); // Top, Left, Bottom, Right
    }

    public static void main(String[] args) {
        new PaddingDemo();
    }
}
