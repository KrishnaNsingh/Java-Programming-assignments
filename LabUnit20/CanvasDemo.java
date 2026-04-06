package LabUnit20;

import java.awt.*;

class MyCanvas extends Canvas {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(10, 10, 100, 100);
    }
}

public class CanvasDemo extends Frame {
    CanvasDemo() {
        add(new MyCanvas());
        setSize(200, 200);
        setVisible(true);
    }
    public static void main(String[] args) { new CanvasDemo(); }
}
