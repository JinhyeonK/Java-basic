import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        int len=a.length();
        a=a.substring(0,1)+"a"+a.substring(2);
        a=a.substring(0,len-2)+"a"+a.substring(len-1);
        System.out.println(a);
    }
}