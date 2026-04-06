package LabUnit21;

import java.awt.*;
import java.util.Calendar;

public class AnalogClock extends Frame implements Runnable {
    int h, m, s;
    AnalogClock() {
        new Thread(this).start();
        setSize(400, 400);
        setVisible(true);
    }
    public void run() {
        try {
            while(true) {
                Calendar cal = Calendar.getInstance();
                h = cal.get(Calendar.HOUR);
                m = cal.get(Calendar.MINUTE);
                s = cal.get(Calendar.SECOND);
                repaint();
                Thread.sleep(1000);
            }
        } catch(Exception e) {}
    }
    public void paint(Graphics g) {
        g.drawOval(100, 100, 200, 200);
        // Drawing simple line logic for seconds (simplified)
        double angle = Math.toRadians((s * 6) - 90);
        g.drawLine(200, 200, (int)(200 + 80 * Math.cos(angle)), (int)(200 + 80 * Math.sin(angle)));
    }
    public static void main(String[] args) { new AnalogClock(); }
}
