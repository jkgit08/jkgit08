package AcEventEx;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AcEventEx implements ActionListener{
  JFrame f;
  JTextField tf;
  public AcEventEx(){
    f=new JFrame();
    tf=new JTextField(16);
    tf.setBounds(150 ,30 ,150,50);
    tf.setBackground(Color.cyan);
    
    JButton b=new JButton("Click");
    b.setBounds(150,100,100,50);
    b.setBackground(Color.green);
    b.setForeground(Color.white);
    b.addActionListener(this);
    
    f.add(tf); f.add(b);
    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
     tf.setText("Welcome to my webpage in java");
  }
  public static void main(String args[]){
      new AcEventEx();
  }
}
