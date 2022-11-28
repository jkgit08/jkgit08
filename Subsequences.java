package subsequences;
public static void subSeq(String str,int idx,String newstr){

  if(idx==str.length()){            //base case
     System.out.println(newstr);
     return;
  }
  
  int curchar=str.charAt(idx);
  
  subSeq(str,idx+1,curchar+newstr);    //add subs.
  
  subSeq(str,idx+1,newstr);          //if not add subs.
}

public class Subsequences{
  public void main(String args[]){
    String str="abc";
    subSeq(str,0,"");
  }
}

//output={abc,ab,ac,a,bc,b,c, ,}

public static void uniquesub(String str,int idx,Hashset<String> set,String res){
   if(idx==str.length()){
     if(set.contains(res)){
        return;
     }
      set.add(res);
      System.out.println(res);
      return;
    }
   uniquesub(str,idx+1,set,res+str.charAt(idx));
}
