class Solution {
    public int romanToInt(String s) {
        Map <Character, Integer> romanLetters = new HashMap<>();
        romanLetters.put('I', 1);
        romanLetters.put('V', 5);
        romanLetters.put('X', 10);
        romanLetters.put('L', 50);
        romanLetters.put('C', 100);
        romanLetters.put('D', 500);
        romanLetters.put('M', 1000);

        int result = romanLetters.get(s.charAt(s.length() - 1));
        for(int i = s.length() - 2; i >= 0; i--){
            if(romanLetters.get(s.charAt(i)) < romanLetters.get(s.charAt(i + 1))){
                result = result - romanLetters.get(s.charAt(i));
            }
            else{
                result = result + romanLetters.get(s.charAt(i));
            }
        }

        return result;
    }
}