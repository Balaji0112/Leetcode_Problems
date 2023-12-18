class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left_ptr = 0
        right_ptr = len(nums) - 1
        while(left_ptr <= right_ptr):
            mid = (left_ptr + right_ptr) // 2
            if(nums[mid] == target):
                return mid
            elif(nums[mid] < target):
                left_ptr = mid + 1
            else:
                right_ptr = mid - 1
        return -1