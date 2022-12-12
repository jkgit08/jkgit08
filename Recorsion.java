
import java.util.*;

public class Recorsion {
     public static void print(int n){                //print number
         if(n==0){
           return;
         }
         print(n-1);             //Asanding order
         System.out.print(n+" ");
        //print(n-1);       //desending order
     }
     public static void sumnum(int i,int n,int sum){    //number of sum
         if(n==i){
             sum+=i;
             System.out.println("Number of sum:"+sum);
          return;
         }sum+=i;
         sumnum(i+1,n,sum);
     }
     public static int fact(int n){      //number of factorial
        if(n==1||n==0){
            return 1; }
        int fnm=fact(n-1);
        int j=n*fnm;
        return j;
     }
     public static void fibvo(int a,int b,int n){    //febvonacci number
        if(n==0){
        return;}
        int c=a+b;
        System.out.print(" "+c);
        fibvo(b,c,n-2);         
     }
     public static int n_pow(int n,int x){
        if(x==0){return 1; }     //n^0=1
        if(n==1){return 0; }     //n^1=1(return)
        int pow=n*n_pow(n,x-1);
        return pow;
     }
     
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=s.nextInt();
        print(n);
                     System.out.println();
                     sumnum(1,n,0);
          int j=fact(n);
          System.out.println("Factoriel nu:"+j);
        int a=0,b=1;
        System.out.print(a+" "+b);
        fibvo(a,b,n);
                     System.out.println();
          int g=n_pow(n,3);
          System.out.println(g);
    }
    
}
