import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int t=a+b+c;
        int avg=t/3;
        System.out.printf("%d/n%d/n%d",t,avg,(t-avg));
    }
}