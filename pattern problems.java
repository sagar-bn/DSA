pattern 1
public class Main {
    public static void main(String[] args) {
       int n = 10;
        int str = 1;
        for(int i =0;i<n;i++){
            for(int j = 0;j<str;j++){
                System.out.print("*");
                
            }
           str++;
            System.out.println();
        }
    }
}
output:
*
**
***
****
*****
******
*******
********
*********
**********



pattern 2
public class main{
    public static void main(String []args){
        int n = 15;
        int str = 1;
        int count = 1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=str;j++){
                System.out.print(count+" ");
                count++;
            }
            str++;
            System.out.println();
            
        }
    }
}
output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 
37 38 39 40 41 42 43 44 45 
46 47 48 49 50 51 52 53 54 55 
56 57 58 59 60 61 62 63 64 65 66 
67 68 69 70 71 72 73 74 75 76 77 78 
79 80 81 82 83 84 85 86 87 88 89 90 91 
92 93 94 95 96 97 98 99 100 101 102 103 104 105 
106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 
 


pattern 3
public class main{
    public static void main(String []args){
       int n = 15;
        int spa = n/2;
        int str = 1;
      
        
        for(int i = 1; i<=n;i++){
            for(int j =1;j<=spa;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=str;k++){
                System.out.print("*");
            }
            
            if(i<=n/2){
                spa--;
                str = str+2;
                
            }
            else{
                spa++;
                str = str-2;
            }
            System.out.println();
        }
    }
}
output:
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *

pattern 4

public class main{
    public static void main(String []args){
       int n = 18;
        int str = n/2+1;
        int spa = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=str;j++){
                System.out.print("*");
                
            }
            for(int k = 1;k<=spa;k++){
                System.out.print(" ");
            }
            for(int l= 1;l<=str;l++){
                System.out.print("*");
                
            }
            if(i<=n/2){
                spa=spa+2;
                str--;
            }
            else{
                str = str+1;
                spa=spa-2;
            }
            System.out.println();
                
        }
    }
}
output:
********** **********
*********   *********
********     ********
*******       *******
******         ******
*****           *****
****             ****
***               ***
**                 **
*                   *
**                 **
***               ***
****             ****
*****           *****
******         ******
*******       *******
********     ********
*********   *********