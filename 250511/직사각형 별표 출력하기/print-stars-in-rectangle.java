import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1 ;j<m;j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}