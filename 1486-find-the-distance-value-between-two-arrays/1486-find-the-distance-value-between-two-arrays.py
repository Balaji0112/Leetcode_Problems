class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        c = 0
        flag = True
        for i in arr1:
            for j in range(0, len(arr2)):
                print(abs(i - (arr2[j])))
                if (abs(i - (arr2[j])) <= d):
                    flag = False
                    break
            if(flag):
                c += 1
            flag = True
        return(c)     