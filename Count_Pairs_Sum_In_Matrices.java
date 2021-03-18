class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int r1 = 0, c1 = 0, r2 = n-1, c2 = n-1, ans = 0;
        
        while(r1 < n && c1 < n && r2 >= 0 && c2 >= 0){
            if(mat1[r1][c1] + mat2[r2][c2] == x){
                ans++;
                
                c1 += 1;
                if(c1 == n){
                    c1 = 0; r1 += 1;
                }
                
                c2 -= 1;
                
                if(c2 < 0){
                    c2 = n-1; r2 -= 1;
                }
            }else if(mat1[r1][c1] + mat2[r2][c2] < x){
                c1 += 1;
                
                if(c1 == n){
                    c1 = 0; r1 += 1;
                }
            }else{
                c2 -= 1;
                
                if(c2 < 0){
                    c2 = n-1; r2 -= 1;
                }
            }
        }
        
        return ans;
    }
}
