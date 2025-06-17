import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> numsMap= new HashMap <>();

        for(int i = 0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                return true;
            }
            else{
                numsMap.put(nums[i],i);
            }
        }

        return false;
    }
}