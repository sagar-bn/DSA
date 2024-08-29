// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sagar=Stones(arr,n);
    }
    public static int Stones(int [] arr,int n){
        PriorityQueue<Integer> min=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            min.add(arr[i]);
        }
        while(min.size()>1){
            int a= min.remove();
            int b=min.remove();
            if(a!=b){
                int c=a-b;
                min.add(c);
            }
        }
        System.out.print(min.peek());
        return 0;
    } 
}
minimize sum:
class Solution {
   
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int i=0;i<N;i++){
            min.add(arr[i]);
        }
      long total=0;
        while(min.size()>1){
         
            int a=   min.poll();
               
            int b=   min.poll();
                 int combaine= a+b;
            
            total += combaine;
            min.add(combaine);
        }
        return total;
    }
}