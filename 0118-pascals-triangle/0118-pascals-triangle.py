class Solution:
    def buildRow(row):
        ans = 1
        result = []
        result.append(ans)
        for i in range(1, row):
            ans = ans * (row - i)
            ans = ans // i
            result.append(ans)
        return result
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(1, numRows+1):
            result.append(Solution.buildRow(i))
        return result
    
            