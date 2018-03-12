import java.util.*;
class abc {
   
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            String m = sc.next();
            char x = m.charAt(0);
            int count=1;
              for (int j = 0; j < m.length(); j++) {
                if(x!=m.charAt(j)){
                    count++;
                    x=m.charAt(j);
                }
            }
            System.out.println((int)Math.floor(count/2));  
        }
    }
}