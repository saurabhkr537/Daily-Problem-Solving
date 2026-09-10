class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;

        List<List<Integer>> result = new ArrayList<>();

        int total = rows * cols;

        k = k % total;

        for (int i = 0; i < rows; i++) {
            result.add(new ArrayList<>());

            for (int j = 0; j < cols; j++) {

                int index = (i * cols + j - k + total) % total;

                int oldRow = index / cols;
                int oldCol = index % cols;

                result.get(i).add(grid[oldRow][oldCol]);
            }
        }

        return result;
    }
}