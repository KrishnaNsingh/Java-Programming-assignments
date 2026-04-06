package LabUnit18;

import java.awt.*;
import java.awt.event.*;

public class MenuApp extends Frame implements ActionListener {
    MenuApp() {
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem m1 = new MenuItem("Open");
        MenuItem m2 = new MenuItem("Quit");
        
        menu.add(m1);
        menu.add(m2);
        mb.add(menu);
        setMenuBar(mb);

        m1.addActionListener(this);
        m2.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Quit")) {
            System.exit(0);
        } else {
            Dialog d = new Dialog(this, "Alert", true);
            d.add(new Label("You clicked: " + cmd));
            d.setSize(200, 100);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MenuApp();
    }
}
