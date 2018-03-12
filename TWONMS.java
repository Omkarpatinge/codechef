import java.util.*;
import java.math.*;
class abc {
   
   public static void find(int a,int b,int n)
   {
       if (n%2!=0) {
           a*=2;
       }
  System.out.println((a>b)?a/b:b/a);
       
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        for (int i = 0; i < no; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            find(a,b,n);
        }
    }
}