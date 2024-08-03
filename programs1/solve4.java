//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class solve4{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = in.nextInt();
        System.out.println("enter Second number");
        int num2 = in.nextInt();
        System.out.println("enter operator like 4 for '/' \n  3 for '*'  \n 2 for '-' \n 1 for '+'");
        int  operat = in.nextInt();
        if (operat == 1) {
            int add=num1+num2;
            System.out.println("The addition of both numbers is"+add);
            } 
        else if (operat == 2) {
            if (num1 < num2) {
                System.out.println("The difference between both the numbers are "+(num2-num1));
            } 
            else {
                System.out.println("The difference between both the numbers are "+(num1-num2));
            }
        } 
        else if (operat ==3) {
            System.out.println("The multiplication between both the numbers are "+num1*num2);
        }
         
        else if (operat ==4) {
            System.out.println("The division of  both the numbers are "+num1/num2);
        } 
        else {
            System.out.println("u entered wrong operator");
        }

    }
}
