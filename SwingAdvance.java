package advance;
                             
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Advance {
        private JFrame mainframe;
        private JLabel headerlabel;
        private JPanel controlpanel;
        private JLabel statuslabel;
        public Advance(){
            prepareGUI();
        }
    public static void main(String[] args) {
        Advance ad=new Advance();
        ad.showLabelDemo();
    }
    private void prepareGUI(){
       mainframe=new JFrame("java Swing Examples");
       mainframe.setSize(400, 450);
       mainframe.setLayout(new GridLayout(4,1));
       mainframe.addWindowListener(new WindowAdapter(){
         public void WindowClosing(WindowEvent we){System.exit(0);}
        });
       headerlabel=new JLabel("",JLabel.CENTER);
       statuslabel=new JLabel("",JLabel.CENTER);
      // statuslabel.setSize(10, 10);
       controlpanel=new JPanel();
       controlpanel.setBackground(Color.GRAY);   //
       controlpanel.setLayout(new FlowLayout());
       
       mainframe.add(headerlabel);
       mainframe.add(statuslabel);
       mainframe.add(controlpanel);
       mainframe.setVisible(true);
    }
    private void showLabelDemo(){
       headerlabel.setText("control in Action:headerLabel");
       statuslabel.setText("java Action:statuslabel");
       
       JLabel label=new JLabel("",JLabel.CENTER);
       label.setText("Welcome to tutorials point in java");
       label.setOpaque(true);
       label.setBackground(Color.CYAN);
       label.setForeground(Color.WHITE);
       controlpanel.add(label);
       mainframe.setVisible(true);
    }
}
