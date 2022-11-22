
package hashMapEx;
import java.util.*;
public class hashMapEx{
   public static void main(String args[]){
     HashMap<String> map=new HashMap<String>();
      map.put("Apple ",477);
      map.put("Cheery",799);
      map.put("banana",80);
      map.clear();      //Before all delete
      map.put("Mango",100);
      System.out.println(map);
   }
}
