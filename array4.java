1: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean result = check(arr,n,k);
        System.out.print(result);
    }
    public static boolean check(int []arr,int n,int k){
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }return false;
    }
}
2: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
       int result = check(arr,n,k);
        System.out.print(result);
    }
    public static int check(int []arr,int n,int k){
        int max=0;
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               k=arr[i]-arr[j];
                   if(k>max){
                       max=k;
                   }
                
            }
        }return max;
    }
}
3: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
       int result = check(arr,n,k);
        System.out.print(result);
    }
    public static int check(int []arr,int n,int k){
        int max=0;
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               k=arr[i]-arr[j]+(i-j);
                   if(k>max){
                       max=k;
                   }
                
            }
        }return max;
    }
}
4: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
       int result = check(arr,n,k);
        System.out.print(result);
    }
    public static int check(int []arr,int n,int k){
        int max=0;
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               k=arr[i]-arr[j]+(j-i);
                   if(k>max){
                       max=k;
                   }
                
            }
        }return max;
    }
}