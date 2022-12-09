package chackboxex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChackboxEx {
        private JFrame mainframe;
        private JLabel headerlabel;
        private JLabel statuslabel;
        private JPanel controlpanel;
        public ChackboxEx(){
            prepare();
        }
    public static void main(String[] args) {
        ChackboxEx demo=new ChackboxEx();
        demo.Showcheckboxdemo();
    }
    private void prepare(){
         mainframe=new JFrame("Java Chackbox Example:");
         mainframe.setLayout(new GridLayout(3,1));
         mainframe.setSize(400, 450);
         mainframe.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent we){System.exit(0);}
         });
         headerlabel=new JLabel("",JLabel.CENTER);
         statuslabel=new JLabel("",JLabel.CENTER);
         statuslabel.setSize(300,350);
         controlpanel=new JPanel();
         controlpanel.setLayout(new FlowLayout());
         mainframe.add(headerlabel);
         mainframe.add(statuslabel);
         mainframe.add(controlpanel);
         mainframe.setVisible(true);
    }
    private void Showcheckboxdemo(){
         headerlabel.setText("Control in Action: Chack Box");
         final JCheckBox japple=new JCheckBox("Apple");
         final JCheckBox jmango=new JCheckBox("Mango");
         final JCheckBox jpeer=new JCheckBox("Peer");
         japple.setMnemonic(KeyEvent.VK_G);
         jmango.setMnemonic(KeyEvent.VK_M);
         jpeer.setMnemonic(KeyEvent.VK_P);
         japple.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent e){
            statuslabel.setText("Apple CheckBox:"+(e.getStateChange()==1?"Checked":"Unchecked"));
           }
         });
         jmango.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent e){
             statuslabel.setText("Mango CheckBox:"+(e.getStateChange()==1?"Checked":"Unchecked"));
           }
         });
         jpeer.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent e){
             statuslabel.setText("Peer ChackBox:"+(e.getStateChange()==1?"Checked":"unchecked"));
           }
         });
         
         controlpanel.add(japple);
         controlpanel.add(jmango);
         controlpanel.add(jpeer);
         mainframe.setVisible(true);
    }
}
