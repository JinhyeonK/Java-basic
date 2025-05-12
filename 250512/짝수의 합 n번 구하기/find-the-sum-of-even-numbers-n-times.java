import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
         a=sc.nextInt();
         b=sc.nextInt();
         int aa=0;
         for(int j=a;j<=b;j++){
            if(j%2==0){
                aa+=j;
            }
         }
        System.out.println(aa);
        }  
    }
}