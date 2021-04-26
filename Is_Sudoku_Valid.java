class Solution{
    static int isValid(int mat[][]){
        // code here
        int seen[] = new int[10];
        
        Arrays.fill(seen, 0);
        
        int val = 0;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                val = mat[i][j];
                
                if (val == 0)
                continue;
                
                if (seen[val] == 1) {
                    //System.out.println("JOY");
                    return 0;
                }
                
                seen[val] = 1;
            }
            
            Arrays.fill(seen, 0);
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                val = mat[j][i];
                
                if (val == 0)
                continue;
                
                if (seen[val] == 1) {
                    //System.out.println("JOYDAS");
                    return 0;
                }
                
                seen[val] = 1;
            }
            
            Arrays.fill(seen, 0);
        }
        
        int row = 0, col = 0;
        
        Arrays.fill(seen, 0);
        
        while (row < 9) {
            for (int i = row; i < row + 3; i++) {
                for (int j = col; j < col + 3; j++) {
                    val = mat[i][j];
                    
                    if (val == 0)
                    continue;
                    
                    if (seen[val] == 1) {
                        //System.out.println("DASJOYDAS");
                        return 0;
                    }
                    
                    seen[val] = 1;
                }
            }
            
            Arrays.fill(seen, 0);
            
            col = (col + 3) % 9;
            
            if (col == 0)
            row += 3;
        }
        
        return 1;
    }
}
