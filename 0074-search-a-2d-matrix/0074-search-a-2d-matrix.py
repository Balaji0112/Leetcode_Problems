class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        value = 0      
        left_ptr = 0
        right_ptr = len(matrix[value]) - 1
        while(left_ptr <= right_ptr):
            mid = (left_ptr + right_ptr) // 2
            if(matrix[value][mid] == target):
                return True  
            elif(matrix[value][mid] <= target):
                left_ptr = mid + 1
            elif(matrix[value][mid] > target):
                right_ptr = mid - 1
            if(left_ptr > right_ptr):     
                if(matrix[value] == matrix[-1]):
                    break
                value += 1
                left_ptr = 0
                right_ptr = len(matrix[value]) - 1
        return False