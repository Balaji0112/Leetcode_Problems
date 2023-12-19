class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        value = 0
        for i in range (0, len(matrix)):
            if(target >= matrix[i][0] and target <= matrix[i][-1]):
                value = i       
        left_ptr = 0
        right_ptr = len(matrix[value]) - 1
        while(left_ptr <= right_ptr):
            mid = (left_ptr + right_ptr) // 2
            if(matrix[value][mid] == target):
                return True
            elif(matrix[value][mid] <= target):
                left_ptr = mid + 1
            else:
                right_ptr = mid - 1
        return False
        