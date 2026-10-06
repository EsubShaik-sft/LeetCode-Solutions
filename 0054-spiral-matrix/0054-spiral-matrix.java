class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> res=new ArrayList<>();
        int dir = 0;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m - 1;
        while(top<=bottom && left <= right){
            if(dir == 0){
                for(int i =left  ;i<=right;i++){
                    res.add(matrix[top][i]);
                }

                top++;
            }
            
            if(dir == 1){
                for(int i = top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            
            if(dir == 2){
                for(int i = right; i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            } 
            
            if(dir == 3){
                for(int i = bottom; i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }   
            
            dir++;
            if(dir>=4){
                dir = 0;
            }
        }
        return res;
    }
}