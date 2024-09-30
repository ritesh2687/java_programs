package java_programs.programs1;
import java.util.Scanner;
public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the elements of array");
        int arr_len=sc.nextInt();
        int[] arr=new int[arr_len];
        for(int i=0;i<arr_len;i++)
        {
            System.out.print("enter the "+i+" position number");
            arr[i]=sc.nextInt();      
        }    
    }
    static void selection(int[] arr)
    { 
     for(int j=0;j<arr.length;j++)
     {
        int start=0;
        int last=arr.length-j-1;
        int max=maxInt(arr,start,last);
        
     }   
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int maxInt(int[] arr,int start,int last)
    {int max=start;
        for(int i=start;i<=last;i++)
        {
        if(arr[max]<=arr[last])
        {
            max=i;
        }
    }
        return max;
        
    
    }
    
}
