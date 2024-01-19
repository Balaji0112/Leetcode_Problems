class Solution {
    public int climbStairs(int n) {
      	if (n <= 3) {
		    return n;	
		}
		int first = 3, sec = 2;
		for(int i = 0; i < n - 3; i++) {
			first = first + sec;
            sec = first - sec;
		}
        return first;
	}  
}