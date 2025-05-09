import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int n= sc.nextInt();
        for(int i=1;i<=100;i++){
            cnt+=i;
            if (cnt>=n){
                System.out.print(i);
                break;
             }
            }
        }
    }
