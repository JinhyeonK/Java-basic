import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] n = new int[10];
        n[0]=a;
        n[1]=b;
        for(int i=2;i<10;i++){
            n[i]=(n[i-2]+n[i-1])%10;
        }
        for(int i=0; i<10; i++)[
            System.out.print(n[i]+" ");
        ]
    }
}