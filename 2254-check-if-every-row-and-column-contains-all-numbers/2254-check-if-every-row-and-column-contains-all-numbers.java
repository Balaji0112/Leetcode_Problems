class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < matrix.length; i++){
            Set <Integer> rowSet = new HashSet<>();
            Set <Integer> colSet = new HashSet<>();
            for(int j = 0; j < matrix[i].length; j++){
                rowSet.add(matrix[i][j]);
                colSet.add(matrix[j][i]);
            }

            if(rowSet.size() != n || colSet.size() != n){
                return false;
            }
        }
        return true;
    }
}