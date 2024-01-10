class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    	int firstIndex = findFirst(nums, target);
    	int lastIndex = findLast(nums, target);
        
        int[] answer = {firstIndex, lastIndex};
        
        return answer;
    }
        public int findFirst(int nums[], int target) {
            int low = 0;
            int high = nums.length - 1;
            int first = -1;
            int mid;
            while(low <= high) {
                mid = (low + high) / 2;
                if(nums[mid] == target) {
                    first = mid;
                    high = mid - 1;
                }
                else if(target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return first;
	}
    
        public int findLast(int[] nums, int target) {
            int last = -1;
            int low = 0;
            int high = nums.length - 1;
            int mid;
            while(low <= high) {
                mid = (low + high) / 2;
                if(nums[mid] == target) {
                    last = mid;
                    low = mid + 1;
                }
                else if(target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return last;
        }
}