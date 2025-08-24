// java code for the prefix sum of the array
import java.util.*;
class Main {
    public static ArrayList<Integer>solving(int[] arr){
        int n=arr.length;
        ArrayList<Integer>name=new ArrayList<>();
        name.add(arr[0]);
        
        for(int i=1;i<n;i++){
            name.add(name.get(i-1)+arr[i]);
         
            
        }
        return name;
    }
    public static void main(String[] args) {
       int [] arr={2,4,5,6,3,6,7,4,8};
       
       System.out.println(solving(arr));
    }
}

output
[2, 6, 11, 17, 20, 26, 33, 37, 45]
