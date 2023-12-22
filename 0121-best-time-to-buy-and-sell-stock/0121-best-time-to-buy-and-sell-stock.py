class Solution:
    def maxProfit(self, arr: list[int]) -> int:
        left_ptr = 0
        right_ptr = 1
        maximum_profit = 0
        
        while(right_ptr < len(arr)):
            if(arr[left_ptr] < arr[right_ptr]):
                profit = arr[right_ptr] - arr[left_ptr]
                if(profit > maximum_profit):
                    maximum_profit = profit
            else:
                left_ptr = right_ptr
            
            right_ptr += 1
            
        return maximum_profit