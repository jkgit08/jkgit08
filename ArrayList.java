package array_list;
import java.util.*;

public class Array_list{
   public static void main(String args[]){
         ArrayList<String> list=new ArrayList<>();   
         list.add("java");
         list.add("Array");
         list.add("Advance");
         list.clear();       //all value delete
         list.add("package");
         Iterator itr=list.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
   }
}
