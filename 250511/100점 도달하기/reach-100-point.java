import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;n<=100;i++){
            if (n>=90){
                System.out.println("A");
            } elif (n>=80){
                System.out.println("B");
            } elif (n>=70){
                System.out.println("C");
            } elif (n=60){
                System.out.println("D");
            } else{
                System.out.println("F");
        }
    }
}
}