class Solution:
    def search(self, arr: List[int], target: int) -> int:
        left_ptr = 0
        right_ptr = len(arr) - 1

        while(left_ptr <= right_ptr):  
            mid = (left_ptr + right_ptr) // 2
            if(arr[mid] == target):
                return mid
            if(arr[left_ptr] <= arr[mid]):
                if(target >= arr[left_ptr] and target <= arr[mid]):
                    right_ptr = mid - 1
                else:
                    left_ptr = mid + 1
            else:
                if(target >= arr[mid] and target <= arr[right_ptr]):
                    left_ptr = mid + 1
                else:
                    right_ptr = mid - 1
        return -1