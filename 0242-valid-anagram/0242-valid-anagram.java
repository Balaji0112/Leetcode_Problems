class Solution {
    public boolean isAnagram(String s, String t) {
        char arrS[] = s.toCharArray();
		char arrT[] = t.toCharArray();
		
        if(arrS.length != arrT.length) {
			return false;
		}
		int[] x = new int[26];
		int[] y = new int[26];
		for(int i = 0; i < arrS.length; i++){
			x[arrS[i] - 'a']++;
		}
		
		for(int j = 0; j < arrT.length; j++){
			y[arrT[j] - 'a']++;
		}
		
		for(int k = 0; k < x.length; k++){
			if(x[k]  == y[k]) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
    }
}