package LabUnit17;

import java.applet.Applet;
import java.awt.*;

/* <applet code="HelloApplet" width="300" height="100"></applet> */
public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        Font f = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20);
        g.setFont(f);
        g.drawString("Hello World", 50, 50);
    }
}
