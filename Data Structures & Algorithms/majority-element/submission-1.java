class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int indexElement = 0;
        if(nums.length == 1) return nums[0];

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            } else {
                map.put(i,1);
            }
            if(map.get(i) > res){
                res = map.get(i);
                indexElement = i;
            }
        }
        return indexElement;
        
    }
}