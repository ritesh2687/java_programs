//To find Armstrong Number between two given number.
import java.util.Scanner;
public class solve9 {
    public static void main(String[] args) {
        int t,k,arm=0;
        Scanner in =new Scanner(System.in);
        System.out.println("enter first number");
        int num1=in.nextInt();
        System.out.println("enter second number");
        int num2=in.nextInt();
        for (int i=num1;i<=num2;i++)
        {  
            for (k=i;k>0;k=k/10)
            {
            t=k%10;
            arm=arm+t*t*t;}
            if(i==arm)
            {
                System.out.println(+arm+" is a armstrong number");
            }
        
        
        }
       }
}
