import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        while(true){
            if (a<=b){
                System.out.print(a+" ");
                if (a%2==0){
                    a+=3;
                }else{
                    a*=2;
                }
            } else{
                break;
            }
        }

    }
}