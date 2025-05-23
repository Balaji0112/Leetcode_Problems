class Solution:
    def findIndices(self, nums: List[int], indexDifference: int, valueDifference: int) -> List[int]:
        for i in range(0, len(nums)):
            for j in range(0, len(nums)):
                if(abs(i - j) >= indexDifference and
                abs(nums[i] - nums[j]) >= valueDifference):
                    return [i,j]
        return [-1,-1]
        