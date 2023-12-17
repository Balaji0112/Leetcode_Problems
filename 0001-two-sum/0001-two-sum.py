class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        tempArr = []
        for i in nums:
            tempArr.append(i)
        tempArr.sort()
        startPtr = 0
        endPtr = len(nums) - 1
        for i in range(0, len(nums)):
            if(tempArr[startPtr] + tempArr[endPtr] == target):
                if(tempArr[startPtr] != tempArr[endPtr]):
                    ans.append(nums.index(tempArr[startPtr]))
                    ans.append(nums.index(tempArr[endPtr]))
                    return ans
                else:
                    for i in range(0,len(nums)):
                        if(nums[i] == tempArr[startPtr]):
                            ans.append(i)
                    return ans
            elif(tempArr[startPtr] + tempArr[endPtr] > target):
                endPtr -= 1
            else:
                startPtr += 1