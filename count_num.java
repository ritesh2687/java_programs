import java.util.Scanner;

public class count_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        System.out.println("enter number which will be find");
        int fnum = in.nextInt();

        // // ****with the help of for_loop ****
        // for (int c = num; c > 0; c--) {
        // int p;
        // int t = 0;
        // p = num % 10;
        // num = num / 10;
        // if (p == fnum) {
        // t++;
        // }
        // System.out.println(" reapeted time"+p);
        // }

        
        // // ****with the help of while loop ****/
        // int count = 0;
        // while (num > 0) {

        //     int p = num % 10;
        //     if (p == fnum) {
        //         count++;
        //     }

        //     num = num / 10;

        // }
        // System.out.println("reapeted times" + count);
    }
}
