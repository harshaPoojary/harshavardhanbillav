//java code for the sufix sum;
import java.util.*;
class Main{
    public static ArrayList<Integer>solving(int[] arr){
        int n=arr.length;
        ArrayList<Integer>val=new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            val.add(0);
        }
        val.set(n-1,arr[n-1]);
        for(int i=n-2;i>=0;i--){
            val.set(i,val.get(i+1)+arr[i]);
        }
        return val;
    }
    public static void main(String[] args){
        int[] arr={2,5,3,7,4,8,9,2,5,6};
        System.out.println(solving(arr));
    }
}

output
[51, 49, 44, 41, 34, 30, 22, 13, 11, 6]
