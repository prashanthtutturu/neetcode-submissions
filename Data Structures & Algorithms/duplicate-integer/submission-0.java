class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        ArrayList<Integer> unique = new ArrayList<>();  
        for (int i: nums){
            if (unique.contains(i)) return true;
            unique.add(i);
        }
        return false;
    }
}