Kth Smallest:
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            maxHeap.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<maxHeap.peek()){
                maxHeap.remove();
                maxHeap.add(arr[i]);
            }
        }
        // code here
    
    return maxHeap.peek();
    
        // Your code here
    }
}
Kth Largest:
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minH=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minH.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>minH.peek()){
                minH.remove();
                minH.add(nums[i]);
            }
        }
       return minH.peek(); 
    }
medianFider:
class MedianFinder {
    PriorityQueue<Integer> min=new PriorityQueue<>();
    PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

        
    }
    
    public void addNum(int num) {
        if(min.size()==max.size()){
            max.add(num);
            min.add(max.remove());
        }
        else{
            min.add(num);
            max.add(min.remove());
        }
    }
    
    public double findMedian() {
        double ans;
        if(min.size()==max.size()){
             ans =(min.peek()+max.peek())/2.0;
            return ans;
        }
        else{
            return ans=min.peek()*1.0;
            
        }
        
    }
}