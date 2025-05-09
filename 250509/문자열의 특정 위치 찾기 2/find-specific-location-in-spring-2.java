import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String [] aa={"apple","banana","grape","blueberry","orange"};
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int cnt=0;
        for(int i=0;i<5;i++){
            if (aa[i].charAt(2)==a||aa[i].charAt(3)==a){
                System.out.println(aa[i]);
                cnt++;
        }
        }
        System.out.println(cnt);
    }
}