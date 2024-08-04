//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class solve7 {
    public static void main(String[] args) {
        int i=0;
        Scanner in =new Scanner(System.in);
        System.out.println("enter first number");
        int f_n=in.nextInt();
        System.out.println("enter Second number");
        int s_n=in.nextInt();
        System.out.println("enter steps of series");
        int n=in.nextInt();
        System.out.println(f_n);
        System.out.println(s_n);
        do{
           
            int num=f_n+s_n;
            System.out.println(+num);
            f_n=s_n;
            s_n=num;
            i++;
        }
        while (i<n-2);
       
    }
}