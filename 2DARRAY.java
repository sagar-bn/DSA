1 PRINT 2D ARRAY : import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
2 PRINT COLUMN WISE: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println(" ");
            }
            
                else{
                    for(int j=m-1;j>=0;j--){
                      System.out.print(arr[i][j]+" "); 
                    }
                    
                }
            }
        }
    }
3 PRINT ZIZAG: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}