1: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
2: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max =arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print(max);
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
        int m=sc.nextInt();
        int o=sc.nextInt();
        if(arr.length>0){
        int temp =arr[m];
        arr[m] =arr[o];
        arr[o]=temp;
     }for(int i=0;i<n;i++){
            
    
        System.out.print(arr[i]+" ");
        }
    }
}
4: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int maxindex =0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                maxindex=i;
            }
        }
         int result = check(arr,max,maxindex);
        System.out.print(result);
        
    }
    public static int check(int [] arr,int max,int maxindex){
        for(int i=0;i<arr.length;i++){
             if(i!=maxindex && max/2>arr[i]){
                 return -1;
             }
            
         }
        return maxindex;
    }
}
5 : import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int result =reverse(arr,arr[0],arr[n-1],n);
        
        
    }
    public static int reverse(int [] arr,int sp,int lp,int n){
        
        while(sp<lp){
            int temp=sp;
            sp=lp;
            lp=temp;
        }
       for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }
}
6 : import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      reverse(arr,0,n-1,n);
        
        
    }
    public static void reverse(int [] arr,int sp,int lp,int n){
        
        while(sp<lp){
            int temp=arr[sp];
            arr[sp]=arr[lp];
            arr[lp]=temp;
            sp++;
            lp--;
        }
       for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
      
    }
}
7: import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int s=sc.nextInt();
        int temp=0;
        while(m<s){
            temp=arr[m];
            arr[m]=arr[s];
            arr[s]=temp;
            m++;
            s--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
8 : import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int [] arr,int sp,int lp){
        while(sp<lp){
            int temp=arr[sp];
            arr[sp]=arr[lp];
            arr[lp]=temp;
            sp++;
            lp--;
        }
    }
}