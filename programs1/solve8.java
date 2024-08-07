//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class solve8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.next();
        String n_str="";
        char sec;
        for(int i=0;i<str.length();i++)
        {     
            sec = str.charAt(i);
            n_str=n_str+sec;
    
        }
        System.out.println(n_str);
        if(n_str!=str)
          {
            System.out.println("it's not palinedrome");
          }
          else{
            System.out.println("it's  palindrome");
          }
    }
}
