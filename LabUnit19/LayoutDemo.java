package LabUnit19;

import java.awt.*;

public class LayoutDemo extends Frame {
    LayoutDemo() {
        // Border Layout (19.3)
        setLayout(new BorderLayout());
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);

        // Center Panel with Grid Layout (19.2)
        Panel p = new Panel();
        p.setLayout(new GridLayout(2, 2));
        p.add(new Button("1"));
        p.add(new Button("2"));
        p.add(new Button("3"));
        p.add(new Button("4"));
        
        add(p, BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutDemo();
    }
}
