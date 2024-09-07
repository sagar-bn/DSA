1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        for(int i=0;i*i<=n;i++){
            ans=i;
        }
        System.out.print(ans);
    }
}
2import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int multiply=1;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            multiply=multiply*lastDigit;
            n=n/10;
        }
        int ans= multiply-sum;
        System.out.print(ans);
    }
}
3
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  int ans=0;
        int first=0;
       int second=1;
        for (int i=1;i<n;i++){
       ans=first+second;
            first=second;
            second=ans;
        }
        System.out.print(ans);
    }
}
4
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=false;
        for(int i=0;i<=n;i++){
            if(i*i==n){
                ans=true;
            }
           
        }
        System.out.print(ans);
    }
}
