class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length - 1;
        int m = grid[0].length;

        int row = n;
        int column = 0;
        int count = 0;
        while(row >= 0 && column < m){
            if(grid[row][column] < 0){
                count+= m - column;
                row--;
            }
            else{
                column++;
            }
        }

        return count;
    }
}
