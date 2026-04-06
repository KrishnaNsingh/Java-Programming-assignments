package LabUnit22;

import java.awt.*;
import java.awt.event.*;

public class CardDemo extends Frame implements ActionListener {
    CardLayout card = new CardLayout();
    Panel p;
    CardDemo() {
        p = new Panel();
        p.setLayout(card);
        
        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");
        b1.addActionListener(this);
        b2.addActionListener(this);

        p.add(b1, "1");
        p.add(b2, "2");
        
        add(p);
        setSize(300, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) { card.next(p); }
    public static void main(String[] args) { new CardDemo(); }
}
