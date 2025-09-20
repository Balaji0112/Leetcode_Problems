class Solution {
    private String frequencyString(String str){
        int[] freq = new int[26];
    
        for(char c: str.toCharArray()){
            freq[c - 'a']++;
        }
        
        
        StringBuilder frequencyString = new StringBuilder();
        char c = 'a';
        for(int num: freq){
            if(num != 0){
            frequencyString.append(c);
            frequencyString.append(num);
            }
        c++;
        }
        
        return(frequencyString.toString());
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        for(int i = 0; i < words.length-1; i++){
            String word1 = frequencyString(words[i]);
            String word2 = frequencyString(words[i+1]);
            if(word1.equals(word2)){
                list.remove(words[i+1]);
            }
        }

        return list;
    }
}