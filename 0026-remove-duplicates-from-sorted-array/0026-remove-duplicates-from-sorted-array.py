class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 1
        for i in range(0,len(nums)-1):
            if(nums[i+1] != nums[i]):
                nums[l] = nums[i+1]
                l += 1
        return l