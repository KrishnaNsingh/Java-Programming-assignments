package LabUnit20;

import java.awt.*;

public class PanelButtonDemo extends Frame {
    PanelButtonDemo() {
        // Create a Panel (20.2)
        Panel p = new Panel();
        p.setBackground(Color.LIGHT_GRAY);

        // Create Buttons (20.1)
        Button b1 = new Button("Submit");
        Button b2 = new Button("Reset");

        p.add(b1);
        p.add(b2);
        add(p); // Add panel to frame

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) { new PanelButtonDemo(); }
}
