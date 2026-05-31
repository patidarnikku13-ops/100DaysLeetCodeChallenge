class Solution {
    int m,n;
    int[][] heights;
    boolean[][] pacific ,atlantic;
    int[][] dirs = {{1,0}, {-1,0}, {0,1},{0,-1}};


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
            if(heights == null || heights.length == 0) return res;

            this.heights = heights;
            m = heights.length; 
            n = heights[0].length;  
            pacific = new boolean[m][n];
            atlantic = new boolean[m][n];


            for(int i = 0 ; i<m;i++) dfs(i, 0, pacific);
            for(int j = 0 ; j<n;j++) dfs( 0,j, pacific);


            for(int i = 0 ; i<m;i++) dfs(i, n-1, atlantic);
            for(int j = 0 ; j<n;j++) dfs( m-1,j, atlantic);


             for(int i = 0 ; i<m;i++) {
                for(int j = 0 ; j<n;j++)  {
                if(pacific[i][j] && atlantic[i][j]){
                res.add(Arrays.asList(i,j));
               
                }
             }
          }
            return res;
            
        }

        void dfs(int r,int c,boolean[][] visited){
            visited[r][c] = true;
            for(int[] d: dirs){
                int nr = r+d[0], nc = c + d[1];
                if(nr<0 || nc<0 || nr>= m || nc>=n) continue;
                if(visited[nr][nc]) continue;
                if(heights[nr][nc] < heights[r][c]) continue;
                dfs(nr ,nc, visited);
            }
        }
        
}