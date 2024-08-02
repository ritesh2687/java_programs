//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class solve3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter principal");
        int principal=in.nextInt();
        System.out.println("enter time");
        int time=in.nextInt();
        System.out.println("enter rate");
        int rate=in.nextInt();
        int interest_rate=principal*rate*time/100;
        System.out.println("your simple interest will be "+interest_rate+" in "+time+" years \n thank u...");
    }
}
