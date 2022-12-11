package comboboxex;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxEx {
          JFrame f;
          JPanel p;
          JLabel l;
          public ComboBoxEx(){
             f=new JFrame("CoboboxExample");
             p=new JPanel();
             l=new JLabel("Action in Panel:ComboBox");
             String s[]={"Country","india","chaina","USA","South America","Pakistan"};
             JComboBox bx=new JComboBox(s);
             p.setBounds(30, 40, 250, 200);
             p.setBackground(Color.GRAY);
             bx.setBackground(Color.CYAN);
            
             p.add(l);
             p.add(bx);
             f.add(p);
             f.setSize(500, 500);
             f.setLayout(null);
             f.setVisible(true);
             
          }
    public static void main(String[] args) {
        new ComboBoxEx();
    }
}
