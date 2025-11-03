class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(i, nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            if(map.containsValue(nums2[i])){
                set.add(nums2[i]);
            }
        }

int[] arr = new int[set.size()];
int i = 0;
for (int num : set) {
    arr[i++] = num;
}        return arr;
    }
}