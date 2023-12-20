class Solution:
    def isPalindrome(self, x: int) -> bool:
        num = list(str(x))
        y = []
        for i in num:
            y.append(i)
        y.reverse()
        if(num == y):
            return True
        else:
            return False