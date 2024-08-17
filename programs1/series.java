package java_programs.programs1;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter steps of series");
        double num = sc.nextDouble();
        System.out.println("enter the value of x");
        double  x= sc.nextDouble();
        double ans = seri(num,x);
        System.out.println(ans);
    
    sc.close();
    }

static double seri(double num,double x)
{
    double  sum=0;
    for(double i=0;i<num;i++)
    {double f=facto(num);
    
        sum+=((x*i)+(i+1))/f;
    }
     return sum;
}

static double facto(double num){
    if (num==0 ) {
    return 1;}
    int  fact=1;
    for (int  j=1;j<=num;j++)
    {
       fact=fact*j;
    }
    return fact;
}
}