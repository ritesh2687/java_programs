package java_programs.programs1;

import java.util.Scanner;

public class Bubble_sort {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the length of the array");
    int arr_len=sc.nextInt();
    int[] arr=new int[arr_len];
    for(int i=0;i<arr_len;i++)
    {   System.out.print("enter the "+i+" position number");
        arr[i]=sc.nextInt();
    }

     sort(arr);
    for(int k=0;k<arr_len;k++)

     { 
    
        System.out.print(+k+" position number is ");
        System.out.println(arr[k]);
 }
 sc.close();  
}

  static void sort(int[] arr) {
    int m=arr.length;
    for (int j = 0; j < m-1; j++) {
      for (int l = 0; l < m-j-1; l++) {
        if (arr[l]> arr[l + 1]) {
          int t;
          t = arr[l];
          arr[l] = arr[l + 1];
          arr[l + 1] = t;
          // return arr[j];

        }
      }
    }
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr);
    // }
  }
}