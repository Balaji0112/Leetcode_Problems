import sys

class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        curr_min = sys.maxsize
        miss = []
        c = 0
        for i in range(1, curr_min):
            if(c != len(arr) and i == arr[c]):      
                c = c + 1
            else:
                miss.append(i)
            if(len(miss) >= k):
                break
        return(miss[-1])