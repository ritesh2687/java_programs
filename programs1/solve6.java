//Input currency in rupees and output in USD.
import java.util.Scanner;
public class solve6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter rupees");
        float rupees=in.nextFloat();
        double USD=rupees*0.012;
        System.out.println("rupees in USD is"+USD);
    }
}
