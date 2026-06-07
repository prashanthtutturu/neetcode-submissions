class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == 0 || nums == null){
            return new int[0];
        }
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue(
            (a,b) -> map.get(a)-map.get(b)
        );

        for (int key : map.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        
        return minHeap.stream().mapToInt(Integer::intValue).toArray();
    }
}
