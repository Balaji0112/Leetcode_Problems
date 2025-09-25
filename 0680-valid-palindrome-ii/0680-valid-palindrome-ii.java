class Solution {

    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        int startPtr = 0;
        int endPtr = s.length()-1;
        int c = 1;
        while(startPtr < endPtr){
            if(s.charAt(startPtr) == s.charAt(endPtr)){
                startPtr++;
                endPtr--;
            }
            else{
                return isPalindrome(s, startPtr+1,endPtr) || isPalindrome(s, startPtr, endPtr-1);
            }
        }

        return true;
    }
}