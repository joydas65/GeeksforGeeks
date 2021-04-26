class Solution
{
    int ans = 0;
    
    int[][] visited;
    
    public boolean valid(int r, int R, int c, int C) {
        return (r >= 0 && r < R && c >= 0 && c < C) ? true : false;
    }
    
    public void bfs(int r, int c, char[][] grid, int R, int C) {
        
        visited[r][c] = 1;
        
        if (valid(r+1, R, c, C) && visited[r+1][c] == 0 && grid[r+1][c] == 'X') 
        bfs(r+1, c, grid, R, C);
        
        if (valid(r-1, R, c, C) && visited[r-1][c] == 0 && grid[r-1][c] == 'X')
        bfs(r-1, c, grid, R, C);
        
        if (valid(r, R, c-1, C) && visited[r][c-1] == 0 && grid[r][c-1] == 'X')
        bfs(r, c-1, grid, R, C);
        
        if (valid(r, R, c+1, C) && visited[r][c+1] == 0 && grid[r][c+1] == 'X')
        bfs(r, c+1, grid, R, C);
    }
    
    public void compute(int row, int col, char[][] grid) {
        visited = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                visited[i][j] = 0;
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 'X') {
                    visited[i][j] = 1;
                    ans++;
                    bfs(i, j, grid, row, col);
                }
            }
        }
    }
    public int xShape(char[][] grid)
    {
        // code here
        ans = 0;
        compute(grid.length, grid[0].length, grid);
        return ans;
    }
}
