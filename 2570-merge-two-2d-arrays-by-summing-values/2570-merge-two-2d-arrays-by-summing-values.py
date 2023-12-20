class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:
        sum_dict = {}
        for num in nums1:
            if num[0] not in sum_dict:
                sum_dict[num[0]] = num[1]
            else:
                sum_dict[num[0]] += num[1]
        for num in nums2:
            if num[0] not in sum_dict:
                sum_dict[num[0]] = num[1]
            else:
                sum_dict[num[0]] += num[1]
        result = sorted([[key, value] for key, value in sum_dict.items()])        
        return result