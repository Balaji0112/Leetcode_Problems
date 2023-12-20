class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x = list(s.split())
        return(len(x[len(x)-1]))