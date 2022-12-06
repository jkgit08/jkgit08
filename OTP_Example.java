package otp_example;
import java.util.*;
                               //Project OTP Password
public class OTP_Example {
          static char[] OTP(int len){      // function
            
              String number="0123456789";
              Random rndm=new Random();
              char[] otp=new char[len];
               for(int i=0;i<len;i++){
                 otp[i]=number.charAt(rndm.nextInt(number.length()));   
               }     
               return otp;
          }
    public static void main(String[] args) {
          int len=4;
          System.out.println("Generating OTP using random():");
          System.out.print("Your otp is: ");
          System.out.println(OTP(len));
          
    }
}
