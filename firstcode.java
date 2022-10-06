package javaapplication6;
class Student{
      int roll;
      String name;
      void callfunction(int a,String n){
           roll=a;
           name=n;
      }
      void display(){
           System.out.println("Student name is:"+name);
           System.out.println("Student roll no:"+roll);
      }
}
public class JavaApplication6 {
    public static void main(String[] args) {
         Student s=new Student();
         Student s2=new Student();
         s.callfunction(344,"ramesh");
         s.display();
         s2.callfunction(156,"jai");
         s2.display();
    }
    
}
