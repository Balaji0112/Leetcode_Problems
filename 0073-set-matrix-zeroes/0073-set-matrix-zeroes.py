class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        row = [0] * len(matrix)
        col = [0] * len(matrix[0])

        for i in range(0,len(matrix)):
            for j in range(0, len(matrix[0])):
                if(matrix[i][j] == 0):
                    row[i] = 1
                    col[j] = 1

        for i in range(0, len(matrix)):
            for j in range(0, len(matrix[0])):
                if(row[i] == 1 or col[j] == 1):
                    matrix[i][j] = 0
                
                    
                    
                    