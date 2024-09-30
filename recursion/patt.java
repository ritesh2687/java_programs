public class patt {
    public static void main(String[] args) {
     pattern(5,0);   
    }

    static void pattern(int r,int c)
    {int a=0;
    if(r<1)
    {
        return ;
    }
    if(c<r){
    
   
    pattern(r,c+1);
    System.out.print(+r+""+c);
    System.out.print("#");
    }
    else
    {
    pattern(r-1,c=0);
    System.out.println();
    }
}
}
