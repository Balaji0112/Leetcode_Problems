class Solution:
    def sortColors(self, nums: List[int]) -> None:
        x = 0
        y = 0
        z = 0

        for i in range(0, len(nums)):
            if(nums[i] == 0):
                x += 1
            if(nums[i] == 1):
                y += 1
            if(nums[i] == 2):
                z += 1

        for i in range(0, len(nums)):
            if(x > 0):
                nums[i] = 0
                x -= 1
            elif(y > 0):
                nums[i] = 1
                y -= 1
            else:
                nums[i] = 2
                z -= 1

        