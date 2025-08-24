import java.util.*;
public class bubblesort{
    public static void bubblesort(int arr[]){ 
        int n=arr.length;
        
        
        for(int i=0;i<n-1;i++){
         
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
               
            }
              System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args){
        int[] arr={3,7,8,3,9,5};
        System.out.println("the original array is");
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        bubblesort(arr);
        System.out.println("the sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}

output:
the original array is
[3, 7, 8, 3, 9, 5]
 
[3, 7, 3, 8, 5, 9]
[3, 3, 7, 5, 8, 9]
[3, 3, 5, 7, 8, 9]
[3, 3, 5, 7, 8, 9]
[3, 3, 5, 7, 8, 9]
the sorted array is:
[3, 3, 5, 7, 8, 9]
