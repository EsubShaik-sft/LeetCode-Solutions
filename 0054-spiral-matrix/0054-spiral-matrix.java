class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
       List<Integer> res=new ArrayList<>();
        int top=0;
        int bottom = m-1;
        int left=0;
        int right=n-1;
         int dir=0;
        while(top<=bottom && left<= right){

            if(dir == 0){
                for(int i =left;i<=right;i++){
                    res.add(matrix[top][i]);

                }
                 top++;
            }
               
            else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
                }
            else if(dir == 2){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir ==3){
                for(int i= bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            dir++;
             if(dir == 4)
               dir = 0;
            }
            return res;
            }
        }
    
