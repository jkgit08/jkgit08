package...
import java.io.*;
public class....{
public void main(String args[]){
     FileOutputStream obj=new FileOutputStream("D:\\Myfile.txt");
     String s="Write a java file...";
     byte b=s.getBytes();
     obj.write(b);
     obj.close();
     System.out.println("Done ...");
   }  
}
