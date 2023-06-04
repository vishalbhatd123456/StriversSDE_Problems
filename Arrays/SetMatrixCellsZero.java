import java.util.HashSet;
import java.util.Set;

class Soultion {
    public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();


        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int i = 0;i < m;i++){
            for(int j = 0; j <n; j++){
                if(rows.contains(i)|| cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}