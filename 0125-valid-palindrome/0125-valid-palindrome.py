class Solution:
    def isPalindrome(self, s: str) -> bool:
        x = []
        for i in list(s):
            if(i.isalnum()):
                x.append(i.lower())
        startPtr = 0
        endPtr = len(x) - 1
        while(startPtr < endPtr):
            if(x[startPtr] != x[endPtr]):
                return False
            startPtr += 1
            endPtr -= 1
        return True