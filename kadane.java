//java code for kadanes algo
import java.util.*;
class Main{
    public static int kadane(int[] arr){
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(currentSum+arr[i],arr[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr={-1,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane(arr));
    }
}
output
  6
  
