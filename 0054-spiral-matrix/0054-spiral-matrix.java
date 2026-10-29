class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();
       int sr = 0 ;
       int sc = 0;
       int er = matrix.length - 1;//n-1 row
       int ec = matrix[0].length - 1;//m-1 column

       while(sr <= er && sc <= ec){
        
        // Top: left to right
            for (int j = sc; j <= ec; j++)
                ans.add(matrix[sr][j]);

            // Right: top to bottom
            for (int i = sr + 1; i <= er; i++)
                ans.add(matrix[i][ec]);

            // Bottom: right to left
            for (int j = ec - 1; j >= sc && sr < er; j--)
                ans.add(matrix[er][j]);

            // Left: bottom to top
            for (int i = er - 1; i > sr && sc < ec; i--)
                ans.add(matrix[i][sc]);

       
          sr++;
          sc++;
          ec--;
          er--;
          

       }
        return ans; 
    }
}