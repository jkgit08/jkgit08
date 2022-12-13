import java.util.*;
import java.util.Arrays;
class Solution {
    public static int
    // Function to get missing number
    MissingNumber(int[] arr)
    {
        int n=arr.length;
        int sum1=((n)*(n+1))/2;
        int sum2;
        for(int i=0;i<n;i++)
          sum2+=arr[i];
        return sum1-sum2;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println(MissingNumber(arr));
    }
}
