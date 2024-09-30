public class subseq {

    public static void main(String[] args) {
        subseq("", "abc");
    }
    static void subseq(String p,String n)
    {
        if(n.isEmpty()){
            System.out.println(p);
        return;
        }
        char ch=n.charAt(0);
        subseq(p+ch, n.substring(1));
        subseq(p,n.substring(1));
    }
}