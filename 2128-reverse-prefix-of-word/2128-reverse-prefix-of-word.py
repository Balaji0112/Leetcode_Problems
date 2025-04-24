class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        req_index = 0
        for i in range(0, len(word)):
            if(word[i] == ch):
                req_index = i
                break
        word = list(word)
        for i in range(0, (req_index+1)//2):
            word[i], word[req_index] = word[req_index], word[i]
            req_index -= 1  
        return ''.join(word)

        