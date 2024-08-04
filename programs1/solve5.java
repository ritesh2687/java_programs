//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class solve5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter first number");
         int num1=in.nextInt();
         System.out.println("enter second number");
         int num2=in.nextInt();
         int ans=(num1>num2) ? num1 :num2;    
        System.out.println("laregst number is "+ans);
        }
}
