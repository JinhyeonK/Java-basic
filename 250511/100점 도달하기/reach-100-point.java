import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;n<=100;i++){
            if (n>=90) {
                System.out.print("A ");
                n+=i;
            } else if (n>=80) {
                System.out.print("B ");
                n+=i;
            } else if (n>=70) {
                System.out.print("C ");
                n+=i;
            } else if (n>=60) {
                System.out.print("D ");
                n+=i;
            } else {
                System.out.print("F ");
                n+=i;
        }
    }
}
}