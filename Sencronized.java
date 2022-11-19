package sencronizedmethod;
class display{
   synchronized void printable(int n){
      for(int i=1;i<=5;i++){
          System.out.print(n*i+" ");
          try{ 
             Thread.sleep(10);
          }catch(Exception e){System.out.println(e);}
      }System.out.println();
   }
}
class MyThread1 extends Thread{
   display d;
   MyThread1(display d){
     this.d=d;
   }
   public void run(){
     d.printable(6);
   }
}
class Mythread2 extends Thread{
   display d;
   Mythread2(display d){
      this.d=d;
   }
   public void run(){
      d.printable(4);
   }  
}
public class SencronizedMethod {
    public static void main(String[] args) {
         display d=new display();
         MyThread1 m=new MyThread1(d);
         m.start();
         Mythread2 m2=new Mythread2(d);
         m2.start();   
    }
}
