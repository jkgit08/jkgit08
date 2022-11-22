package stack_list;
import java.util.*;
public class Stack_list {
    public static void main(String[] args) {
         Stack<String> st=new Stack<String>();
         st.push("ram");
         st.push("jai");
         st.push("Raja");
         st.push("Aman");
         st.pop();  //secondlast value delete
         Iterator<String> it=st.iterator();
         while(it.hasNext()){System.out.println(it.next());}
                    //HashSet program
         HashSet<String> has=new HashSet<String>();
         has.add("pavan");
         has.add("Akash");
         has.add("456467");
         has.add("Vaibhav");
         Iterator<String> io=has.iterator();
         while(io.hasNext()){System.out.println(io.next());}
    }
    
}
