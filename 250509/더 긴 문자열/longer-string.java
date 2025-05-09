import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int len1= a.length();
        int len2= b.length();
        if(len1 > len2)
            System.out.print(str1 + " " + len1);
        else if(len1 < len2)
            System.out.print(str2 + " " + len2);
        else
            System.out.print("same");        

    }
}