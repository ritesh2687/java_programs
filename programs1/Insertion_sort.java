package java_programs.programs1;
import java.util.Scanner;
public class Insertion_sort{
   public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
    System.out.println("enter the length of the array");
    int arr_len=sc.nextInt();
    int[] arr=new int[arr_len];
    for(int i=0;i<arr_len;i++)
    {   System.out.print("enter the "+i+" position number");
        arr[i]=sc.nextInt();
    }
    insertionsort(arr);
    for(int i=0;i<arr.length;i++)
    {
     System.out.println(arr[i]);
     System.out.println(arr);
    }
    sc.close();

   }
   static void insertionsort(int[] arr)
   {
     int l=arr.length;
     for(int s=0;s<l-1;s++)
     {
      for(int t=1;t>0;t--)
      {
         if(arr[s]<arr[s-1])
         {
            swap(arr,s,s-1);
         }
      }
     }
   }
   static void swap(int[] arr,int s,int t)
   {
      int tst=arr[s];
      arr[s]=arr[t];
      arr[t]=tst;
   }
}
//