package java_programs.functions;

import java.util.*;


public class Area {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double n=sc.nextDouble();
        System.out.println("enter the edge of square");
        double r=sc.nextDouble();
        System.out.println("enter the width of rectrangle");
        double w=sc.nextDouble();
        System.out.println("enter the length of circle");
        double l=sc.nextDouble();

        double ans= c_area(n);
        System.out.println("arae of circle is"+ans);
        double ans_1=s_area( r);
        System.out.println("area of square is "+ans_1);
        double ans_2=r_area( w, l);
        System.out.println("area of rectrangle is "+ans_2);
    }

        static double c_area(double n){
            double area_c=3.14*n*n;
            return area_c;
        }

        
        static double s_area(double r){
            double area_s=r*r;
            return area_s;

        }

        static double r_area(double w,double l){
            double area_r=w*l;
            return area_r;
            
        }

        


    }
    

