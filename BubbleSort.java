package bubblesort;

public class BubbleSort{
   public static void main(String args[]){
     int arr[]={8,2,6,7,1,4,3,5};
     
     for(int i=0;i<arr.leanth;i++){
       for(int j=0;j<arr.leanth-1;j++){
         if(arr[j]>arr[j+1]){
           int temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
         }
       }
     } 
       System.out.print("Output is :");
       for(int g=0;g<arr.leanth;g++){
        System.out.print(arr[g]+" ");
       }
   }
}
