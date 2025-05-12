import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [4][4];
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                a[i][j]=sc.nextInt();
            }
        }
        int tt=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if (a[i][j]%5==0){
                    tt++;
                }
            }
        }
        System.out.print(tt);
    }
}