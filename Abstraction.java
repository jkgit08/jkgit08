package abstraction;

abstract class shape{
   abstract void draw();
} 
class rectangle extends shape{
    void draw(){
       System.out.println("Drawing Rectangle");
    }
}
class triangle extends shape{
    void draw(){
       System.out.println("Drawing Triangle");
    }
} 
class circle extends shape{
    void draw(){
       System.out.println("Drawing Circle");
    }
}
  
public class A  bstraction{
  public void main(String args[]){
      shape s;
       s=new rectangle();
       s.draw();
       s=new triangle();
       s.draw();
       s=new circle();
       s.draw();
  }
}
