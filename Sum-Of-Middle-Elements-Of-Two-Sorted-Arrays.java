class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int c = 0, i = 0, j = 0;
        while (c != n-1 && i < n && j < n) {
            if (ar1[i] <= ar2[j]) {
                i++;
                c++;
            }
            else {
                j++;
                c++;
            }
        }
        
        if (i >= n) {
            return ar2[j] + ar2[j+1];
        }
        
        if (j >= n) {
            return ar1[i] + ar1[i+1];
        }
        
        int first = ar1[i] <= ar2[j] ? ar1[i] : ar2[j];
        
        if (first == ar1[i]) i++;
        else if (first == ar2[j]) j++;
        
        if (i >= n) return first + ar2[j];
        
        if (j >= n) return first + ar1[i];
        
        return ar1[i] <= ar2[j] ? first + ar1[i] : first + ar2[j];
    }
}
