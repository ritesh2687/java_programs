public class fisrtfileofrecurtuion {
    public static void main(String[] args) {
        print1();
    }
    static void print1()
    {
        System.out.println("print1 call");
        print2();
    }
    static void print2()
    {

        
        System.out.println("print2 call");
        print3();
    }
    static void print3()
    {
        System.out.println("print3 call");
        print4();
    }
    static void print4()
    {
        System.out.println("print4 call");
        print5();
    }
    static void print5()
    {
        System.out.println("print5 call");
        
    }

}
