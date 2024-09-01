minPathMatrix
class Solution {
    public int minPathSum(int[][] grid) {
        int [][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);

        }

        return path(grid,grid.length-1,grid[0].length-1,dp);
        //learning if length not given in parameter need to give ourself using array name ie if m*n then mis grid.length;if n = grid[0].length gives no of coloumn
        
    }
    public int path(int [][]grid,int m,int n,int [][]dp){
    if(m<0||n<0){return Integer.MAX_VALUE;}
    if(m==0&&n==0){return grid[m][n];}
    if(dp[m][n]!=-1){return dp[m][n];}


        int x= path(grid,m-1,n,dp);
        int y=path(grid,m,n-1,dp);
        
       int ans= Math.min(x,y)+grid[m][n];
       dp[m][n]=ans;
       return ans;
    }
}
grid =
[[1,3,1],[1,5,1],[4,2,1]]
Output
7
Expected
7