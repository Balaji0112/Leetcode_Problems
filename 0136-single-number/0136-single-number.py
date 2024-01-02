class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        c = nums[0]
        if(len(nums) == 1):
            return(c)
        for i in range(1, len(nums)):
            c = (c ^ nums[i])
        return(c)