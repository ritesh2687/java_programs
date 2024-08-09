import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of array");
        int len=input.nextInt();
       
        int[] arr=new int[len];
         for(int i=0;i<len;i++)
         {
            System.out.println("enter number on index"+i);
            arr[i]=input.nextInt();
         }
         System.out.println("enter the target number");
         int target=input.nextInt();
         int ans=binarySearch(arr, target);

         System.out.println("Index og target value is"+ans);
        
    }
    static int binarySearch(int[] arr,int target){
    int start=0;
    int end = arr.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target< arr[mid]){
            end=mid-1;
        }
        else if(target>arr[mid])
        {
            start=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
    }
}
