package constructoroverloading;
class student{
    int roll;
    String name;
    int age;
    student(int r,String n){    //first overload
        roll=r;
        name=n;
    }
    student(int r,String j,int a){   //second overload
        roll=r;
        name=j;
        age=a;
    }
    void display(){
        System.out.println(roll+"\t"+name+"\t"+age);
    }
}   
public class Constructoroverloading {
    public static void main(String[] args) {
         student s=new student(111,"jaiy",21);
         student s2=new student(333,"manindar");
         s.display();
         s2.display();
    }
}
