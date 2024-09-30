import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,4,8,6,3,2,7} ;
        bubble(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr,int start,int end)
    {
        if(start==0)
        {
            return;
        }
        if(end<start)
        {
            if(arr[end]>arr[end+1])

            {
                int temp=arr[end];
                arr[end]=arr[end+1];
                arr[end+1]=temp;
            }
            bubble(arr,start,end+1);
        }
            else{
                bubble(arr, start-1, 0);
            }
        
    }
}
