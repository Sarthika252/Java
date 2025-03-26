import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exp_9_2 extends JFrame implements ItemListener {
    JLabel l;
    JRadioButton r1, r2, r3;
ButtonGroup b=new ButtonGroup();

    public Exp_9_2() {
        setTitle("JRadioButton Demo");
        setLayout(null);
        l = new JLabel("Please choose your favorite language:");
        r1 = new JRadioButton("Java");
        r2 = new JRadioButton("ASP.Net");
        r3 = new JRadioButton("SQL");

        l.setBounds(0, 30, 300, 20);
        r1.setBounds(0, 70, 150, 20);
        r2.setBounds(0, 110, 100, 20);
        r3.setBounds(0, 150, 100, 20);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        add(l);
        b.add(r1);
        b.add(r2);
        b.add(r3);
        add(r1);
        add(r2);
        add(r3);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == r1) {
            if (e.getStateChange() == 1) {
                JOptionPane.showMessageDialog(this, "The Java option has been selected");
            }
        }

        if (e.getSource() == r2) {
            if (e.getStateChange() == 1) {
                JOptionPane.showMessageDialog(this, "The ASP.Net option has been selected");
            }
        }

        if (e.getSource() == r3) {
            if (e.getStateChange() == 1) {
                JOptionPane.showMessageDialog(this, "The SQL option has been selected");
            }
        }
    }



    public static void main(String args[]) {
        Exp_9_2 obj = new Exp_9_2();
    }
}