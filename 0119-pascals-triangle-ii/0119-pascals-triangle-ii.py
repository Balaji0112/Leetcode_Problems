class Solution:
    def getRow(self, rowIndex: int):
        ans = []
        result = 1
        ans.append(result)
        rowIndex += 1
        for i in range(1, rowIndex):
            result = result * (rowIndex - i)
            result = result // i
            ans.append(result)
        return ans