class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
        
            int rig=n-1;
            int lef=0;
            while(lef<rig){
                int temp=matrix[i][lef];
                matrix[i][lef]=matrix[i][rig];
                matrix[i][rig]=temp;
                lef++;
                rig--;
            }
            
        }
    }
}