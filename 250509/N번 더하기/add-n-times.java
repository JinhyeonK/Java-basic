import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a,n;
        a=sc.nextInt();
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
            System.out.println((a+n));
            a=a+n;
    }
}