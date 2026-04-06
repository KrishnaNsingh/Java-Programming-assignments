package LabUnit22;

import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="LifeCycleApplet" width="300" height="100"></applet> */
public class LifeCycleApplet extends Applet {
    public void init() { System.out.println("init() called"); }
    public void start() { System.out.println("start() called"); }
    public void paint(Graphics g) { g.drawString("Check Console for Lifecycle", 20, 20); }
    public void stop() { System.out.println("stop() called"); }
    public void destroy() { System.out.println("destroy() called"); }
}
