package LabUnit20;

import java.awt.*;
import java.awt.event.*;

public class MouseTracker extends Frame implements MouseMotionListener {
    String msg = "";
    MouseTracker() {
        addMouseMotionListener(this);
        setSize(300, 300);
        setVisible(true);
    }
    public void mouseMoved(MouseEvent e) {
        msg = "X: " + e.getX() + ", Y: " + e.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent e) {}
    public void paint(Graphics g) { g.drawString(msg, 50, 150); }
    public static void main(String[] args) { new MouseTracker(); }
}
