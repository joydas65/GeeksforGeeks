class Solution{
    static boolean isIndexValid(int row, int col, int n) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }
    
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int[][] dp = new int[N][N];
        int t1,t2,t3;
        
        for (int i = 0; i < N; i++) {
            dp[N-1][i] = Matrix[N-1][i];
        }
        
        for (int i = N-2; i >= 0; i--) {
            t1 = 0; t2 = 0; t3 = 0;
            for (int j = 0; j < N; j++) {
                if (isIndexValid(i+1, j, N)) {
                    t1 = Matrix[i][j] + dp[i+1][j];
                }
                
                if (isIndexValid(i+1, j-1, N)) {
                    t2 = Matrix[i][j] + dp[i+1][j-1];
                }
                
                if (isIndexValid(i+1, j+1, N)) {
                    t3 = Matrix[i][j] + dp[i+1][j+1];
                }
                
                dp[i][j] = Math.max(Math.max(t1, t2), t3);
            }
        }
        
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, dp[0][i]);
        }
        
        return ans;
    }
}
