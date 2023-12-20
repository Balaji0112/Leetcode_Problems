class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        mergedWord = []
        for i in range(0, len(word1)+len(word2)):
            if(len(word1) > i):
                mergedWord.append(word1[i])
            if(len(word2) > i):
                for j in range(i, i+1):
                    mergedWord.append(word2[j])
        return ''.join(mergedWord)
            