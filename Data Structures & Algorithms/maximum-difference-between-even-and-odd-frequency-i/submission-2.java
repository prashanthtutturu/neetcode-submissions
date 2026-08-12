class Solution {
    public int maxDifference(String s) {

        Map<Character, Integer> map = new HashMap<>();
        
        int n = s.length();

        for(int i = 0; i< n; i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;

        for (int value : map.values()) {
            if (value % 2 != 0) {
                oddMax = Math.max(oddMax, value);
            } else {
                evenMin = Math.min(evenMin, value);
            }

        
    }
    return oddMax-evenMin;
}
}