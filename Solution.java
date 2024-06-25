import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sce = new Scanner(System.in);
       
        int k = sce.nextInt();
       
        Solution solution = new Solution();
        String ans = solution.Solution(k);
        System.out.println(ans);
    }
    
    public String Solution(int k){
         Queue<String> q = new LinkedList<>();
         q.add("1");
         q.add("2");
        String ans ="";
     for(int i= 0; i< k;i++){
           
            String temp = q.poll();
              ans = temp;
            q.add(temp+"1");
            q.add(temp+"2");
           
        }
        return ans;
    }
}