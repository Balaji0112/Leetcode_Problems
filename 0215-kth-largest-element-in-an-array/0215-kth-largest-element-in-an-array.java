class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        for(int value: nums){
            minHeap.add(value);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }
}