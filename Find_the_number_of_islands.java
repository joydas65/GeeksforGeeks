class Islands
{
    
    static boolean isSafe(ArrayList<ArrayList<Integer>> arr, int row, int col, int n, int m, boolean visited[][]){
        return (row >= 0) && (row < n) && (col >= 0) && (col < m) && (arr.get(row).get(col) == 1 && !visited[row][col]);
    }
    
    static void DFS(ArrayList<ArrayList<Integer>> arr, boolean visited[][], int n, int m, int row, int col){
        int rows[] = {-1,-1,-1,0,0,1,1,1};
        int cols[] = {-1,0,1,-1,1,-1,0,1};
        
        visited[row][col] = true;
        
        for(int i = 0; i < 8; i++){
            if(isSafe(arr, row + rows[i], col + cols[i], n, m, visited))
            DFS(arr, visited, n, m, row + rows[i], col + cols[i]);
        }
    }
    
    // Function to find the number of island in the given list
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
    {
        boolean visited[][] = new boolean[N][M];
        
        int c = 0;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(list.get(i).get(j) == 1 && !visited[i][j]){
                    DFS(list, visited, N, M, i, j);
                    ++c;
                }
            }
        }
        
        return c;
        // Your code here
        
    }
    
}
