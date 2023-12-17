class Solution:
    def searchInsert(self, nums: List[int], target: int):
        l = len(nums)
        if(l%2 == 0):
            mid = l//2
        else:
            mid = l//2 + 1 
        
        if(target > nums[mid-1]):
            for i in range(mid-1, l):
                if(nums[i] == target or target - nums[i] < 1):
                    return(i)
        else:
            for i in range(0, mid+1):
                if(nums[i] == target or target - nums[i] < 1):
                    return(i)        
        return l