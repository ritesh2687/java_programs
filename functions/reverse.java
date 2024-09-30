public class reverse {
   
public static void main(String[] args) {
    int ans=rev(15536);
 System.out.print(ans);
}
static int re_n=0;
  static int rev(int n)
  {
  
  if(n==0)
  {
    return n;
  }
  int t=n%10;
   re_n=re_n*10+t;
   rev(n/10);
  return re_n;

}
}