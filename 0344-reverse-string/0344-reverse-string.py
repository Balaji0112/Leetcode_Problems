class Solution:
    def reverseString(self, s: List[str]):
        l = len(s) 
        for i in range(0, l//2):
            s[i], s[l - i - 1] = s[l -i -1], s[i] 
        return s  