class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		List<Integer>[] buckets = new List[nums.length+1];
        Map <Integer, Integer> frequencyMap = new HashMap<>();

        for(int n: nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for(int key: frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        int[] res = new int[k];
        int counter = 0;

        for(int pos = buckets.length - 1; pos >= 0 && counter < k; pos--){
            if(buckets[pos] != null){
                for(Integer element: buckets[pos]){
                    res[counter++] = element;
                }
                
            }
        }

        return res;
            
    }
}