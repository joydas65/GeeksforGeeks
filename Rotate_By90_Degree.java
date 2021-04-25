class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int row = 0, col = 0; int r = matrix.length, c = matrix[0].length;
        
        int x = r;
        
        while (x > 1) {
            for (int i = col; i < (c - col - 1); i++) {
                int t1 = matrix[row][i];
                
                int t2 = matrix[r - i - 1][col];
                
                int t3 = matrix[r - row - 1][c - i - 1];
                
                int t4 = matrix[i][c - col - 1];
                
                matrix[r - i - 1][col] = t1;
                
                matrix[r - row - 1][c - i - 1] = t2;
                
                matrix[i][c - col - 1] = t3;
                
                matrix[row][i] = t4;
            }
            
            x -= 2;
            
            row += 1;
            
            col += 1;
        }
    }
}
