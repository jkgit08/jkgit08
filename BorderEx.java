package borderex;

public class BorderEx{
   JFrame mf;
   public BorderEx(){
      mf=new JFrame("BorderLayout Example");
      mf.setSize(400,400);
      JButton e=new JButton("East");
      JButton w=new JButton("West");
      JButton n=new JButton("North");
      JButton s=new JButton("South");
      JButton c=new JButton("Center");
     
      mf.add(e, BorderLayout.EAST);
      mf.add(w, BorderLayout.WEST);
      mf.add(n, BorderLayout.NORTH);
      mf.add(s, BorderLayout.SOUTH);
      MF.add(c, BorderLayout.CENTER);
     
      mf.setVisible(true);
     }
   public static void main(String args[]){
       new BorderEx();
   }
}
