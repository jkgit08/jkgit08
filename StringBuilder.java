package string_builder;

public class String_Builder {
    public static void main(String[] args) {
        
      StringBuilder sb=new StringBuilder("Jaik");
        
        System.out.println(sb);    //Jaik
        // char at index 0
        System.out.println(sb.charAt(1));     //a
        
        //set char at index 0
        sb.setCharAt(0, 'M');
        System.out.println(sb);       //Maik
        
        //insert index 0
        sb.insert(0, 'T');           //TMaik
        System.out.println(sb);
        
        //delete the index 'n'        01234
        sb.delete(2, 3);            //TM_ik   (2) 
        System.out.println(sb);   //TMik
        
        //add
        sb.append("jai");
        System.out.println(sb);    //TMikjai
        //length
        System.out.println(sb.length());   // 7
    }
    
}
