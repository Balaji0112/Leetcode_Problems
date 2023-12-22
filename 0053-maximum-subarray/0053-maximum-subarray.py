import sys
class Solution:
    def maxSubArray(self, arr: List[int]) -> int:
        max = -sys.maxsize-1
        sum = 0

        for i in range(0, len(arr)):
            sum += arr[i]
            if(sum > max):
                max = sum
            if(sum < 0 and len(arr)!=1):
                sum = 0
                
        return max
        