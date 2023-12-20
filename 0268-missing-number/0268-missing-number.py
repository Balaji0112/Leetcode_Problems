class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        def mergeSort(nums):
            if len(nums) <= 1:
                return nums

            mid = len(nums) // 2
            left = mergeSort(nums[:mid])
            right = mergeSort(nums[mid:])

            return merge(left, right)

        def merge(left, right):
            merged = []
            i = j = 0
            while i < len(left) and j < len(right):
                if left[i] < right[j]:
                    merged.append(left[i])
                    i += 1
                else:
                    merged.append(right[j])
                    j += 1
            while i < len(left):
                merged.append(left[i])
                i += 1
            while j < len(right):
                merged.append(right[j])
                j += 1
            return merged

        sorted_nums = mergeSort(nums)
        n = len(nums)
        for i in range(0, n+1):
            if i not in sorted_nums:
                return i
            
