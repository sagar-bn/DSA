import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r=sc.nextInt();
        int fact =fact(n);
        int npr = permutation(n,r);
        int ncr = combination(n,r);
        System.out.println(fact);
        System.out.println(npr);
        System.out.print(ncr);
    }
    public static int fact(int n){
        int facts = 1;
        for(int i=1;i<=n;i++){
            facts=facts*i;
        }
        return facts;
    }
    public static int permutation(int n, int r){
        int result = fact(n)/fact(n-r);
        return result;
    }
    public static int combination(int n,int r){
        int res = fact(n)/(fact(n-r)*fact(r));
        return res;
    }
}
2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int factor =fact(n);
        System.out.print(factor);
        
    }
    public static int fact(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count ++;
            }
            
        }
        return count;
    }
}
3
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n%2==0){
            System.out.println("Yay");
        }
        else{
            System.out.print("Nay");
        }
    }
}
4
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=(n*(n+1))/2;
        System.out.print(result);
    }
}