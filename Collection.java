package linked_list;          //LinkedList
import java.util.*;
public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> lin=new LinkedList<String>();
        lin.add("Java program");
        lin.add("Linked list");
        lin.add("jaik");
        lin.add("Programming");
        lin.pop();              //first value delete
        Iterator<String> it=lin.iterator();
        while(it.hasNext()){System.out.println(it.next());  }

//ArrayList
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Aman sing");
        arr.add("Yashvant sing");
        arr.add("Akash pande");
        arr.add("Nilesh sharma");
      Iterator<String> it=arr.iterator();
      while(it.hashNext()){ System.out.println(it.next());  }
      
    } 
}

