class Solution {
    private String getFrequencyString(String str){
        int[] freq = new int[26];

        for(char c: str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder();
        char c = 'a';
        for(int i: freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }

        return frequencyString.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyMapString = new HashMap<>();

        for(String c: strs){
            String frequencyString = getFrequencyString(c);

            if(frequencyMapString.containsKey(frequencyString)){
                frequencyMapString.get(frequencyString).add(c);
            }
            else{
                List<String> strlist = new ArrayList<>();
                strlist.add(c);
                frequencyMapString.put(frequencyString, strlist);
            }
        }

        return new ArrayList<>(frequencyMapString.values());
    }
}