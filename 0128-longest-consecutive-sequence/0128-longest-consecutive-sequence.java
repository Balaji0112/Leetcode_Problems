class Solution {
    public int longestConsecutive(int[] nums) {
        Map <Integer, Boolean> visitedMap = new HashMap<>();
        int longestLength = 0;
        for(int num: nums){
            visitedMap.put(num, Boolean.FALSE);
        }

        for(int num: nums){
            int currLength = 1;

            int nextNum = num + 1;
            while(visitedMap.containsKey(nextNum) && visitedMap.get(nextNum) == false){
                currLength++;
                visitedMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            int prevNum = num - 1;
            while(visitedMap.containsKey(prevNum) && !visitedMap.get(prevNum)){
                currLength++;
                visitedMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }

            longestLength = Math.max(longestLength, currLength);
        }

        return longestLength;
    }
}