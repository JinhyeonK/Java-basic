import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] r=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                r[i][j]=a[i][j]*b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(r[i][j]+" ");
            }
        System.out.println();
        }
    }
}