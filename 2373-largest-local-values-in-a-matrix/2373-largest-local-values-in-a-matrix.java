class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int ans[][] = new int[n-2][n-2];

        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                ans[i][j] = maxElement(grid,i,j);
            }
        }
        return ans;
    }

    int maxElement(int a[][], int i,int j){
        int max = 0;
        for(int r=i;r<i+3;r++){
            for(int c=j;c<j+3;c++){
                max = Math.max(max, a[r][c]);
            }
        }
        return max;
    }
}