class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            list.add(i);
        }
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(list.contains(grid[i][j])){
                    list.remove(Integer.valueOf(grid[i][j]));
                }else{
                    list.add(0, grid[i][j]);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}