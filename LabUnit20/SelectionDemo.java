package LabUnit20;

import java.awt.*;
import java.awt.event.*;

public class SelectionDemo extends Frame implements ItemListener {
    Checkbox cb1, cb2;
    CheckboxGroup cbg;
    Checkbox rb1, rb2;
    TextField tf;

    SelectionDemo() {
        setLayout(new FlowLayout());
        tf = new TextField(20);
        
        cb1 = new Checkbox("Checkbox 1");
        cb2 = new Checkbox("Checkbox 2");
        
        cbg = new CheckboxGroup();
        rb1 = new Checkbox("Option 1", cbg, false);
        rb2 = new Checkbox("Option 2", cbg, false);

        cb1.addItemListener(this); cb2.addItemListener(this);
        rb1.addItemListener(this); rb2.addItemListener(this);

        add(cb1); add(cb2); add(rb1); add(rb2); add(tf);

        setSize(400, 200);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == cb1) tf.setText("Checked: 1");
        else if (source == cb2) tf.setText("Checked: 2");
        else if (source == rb1) tf.setText("Option: 1");
        else if (source == rb2) tf.setText("Option: 2");
    }
    public static void main(String[] args) { new SelectionDemo(); }
}
