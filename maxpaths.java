maxpaths in matrix:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int [][] mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             mat[i][j]=sc.nextInt();
                }
        }
       System.out.print(Path(mat,m-1,n-1));//learning cannot return because main static void it doesent return anything path class if accsessing from static class need to be static-->global variable
        
    }
    public static int Path(int [][] mat,int m,int n){
        if(m<0||n<0){return 0;}
        if(m==0&&n==0){
            return 1;
        }
        if(mat[m][n]==0){
            return 0;
        }
        
        
        int x = Path(mat,m-1,n);
        int y = Path(mat,m,n-1);
        
        return x+y;
    }
}