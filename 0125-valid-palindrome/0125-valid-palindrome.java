class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int startPtr = 0;
        int endPtr = s.length() - 1;

        while(startPtr < endPtr){
            if(s.charAt(startPtr) == s.charAt(endPtr)){
                startPtr++;
                endPtr--;
                continue;
            }
            return false;
        }

        return true;
    }
}