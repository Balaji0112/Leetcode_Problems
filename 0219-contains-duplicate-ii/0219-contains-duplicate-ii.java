class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> value = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(value.containsKey(nums[i]) && Math.abs(value.get(nums[i]) - i) <= k){
              return true;
            }
            else{
                value.put(nums[i], i);
            }
        }
        return false;
    }
}