import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner (System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int [][] a =new int [n][m];
        int [][] r=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int [][] b =new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (a[i][j]==b[i][j]){
                    r[i][j]=0;
                } else{
                    r[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(r[i][j]+" ");
            }
        System.out.println();
        }


    }
}