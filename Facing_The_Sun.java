class Solution {
    int countBuildings(int h[], int n) {
        // code here
        int maxSoFar = h[0], ans = 1;
        
        for(int i = 1; i < n; i++){
            if(maxSoFar < h[i]){
                maxSoFar = h[i];
                ans++;
            }
        }
        
        return ans;
    }
}
