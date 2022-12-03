package AWTControl;
import java.awt.*;
import java.awt.event.*;

public class AWTControl{
       private JFrame mf;
       private JLabel hl;
       private JLabel sl;
       private JPanel cp;
       public AWTControl(){
          prepareGUI();
       }
  public static void main(String args[]){
         AWTControl demo=new AWTControl();
         demo.ShowEventdemo();
  }
  private void prepareGUI(){
     mf=new JFrame("AWT Control Example");
     mf.setSize(400,400);
     mf.setLayout(new GridLayout(3,1));
     mf.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){ 
         System.exit(0); }
     });
     hl=new JLabel("",JLabel.CENTER);
     sl=new JLabel("",JLabel.CENTER);
     cp=new JPanel();
     cp.setLayout(new FlowLayout());
     mf.add(hl);
     mf.add(sl);
     mf.add(cp);
     mf.setSize(450,400);
     mf.setVisible(true);
  }
  private voic ShowEventdemo(){
     hl.setText("Control in Action :AWT Button");
     Button ok=new Button("OK");
     Button sub=new Button("Submit");
     Button cen=new Button("Cencel");
     ok.setActionCommand("Ok");
     sub.setActionCommand("Submit");
     cen.setActionCommand("Cencel");
     ok.addActionListener(new ButtonClickListener());
     sub.addActionListener(new ButtonClickListener());
     cen.addActionListener(new BUttonClickListener()); 
     cp.add(ok);
     cp.add(sub);
     cp.add(cen);
     mf.setVisible(true);
     }
     private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
          String s=e.getActionCommand();               
          if(s.equals("Ok")){
            sl.setText("OK Bottun Clicked");
          }
          else if(s.equals("Submit")){
            sl.setText("Submit Bottun Clicked");
          }
          else {
            sl.setText("Cencel Button Clicked");
          }
          /*
          switch(s){
            case "Ok" :sl.setText("OK Button Clicked");
            break;
            case "Submit" : sl.setText("Submit Button Clicked");
            break;
            case "Cencel" : sl.setText("Cencel Button Clicked");
            break;
          }
          */
        }
     }
}
