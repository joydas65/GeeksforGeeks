class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        
        int c = 0, i = 0, j = 0;
        
        while (i < n && j < m) {
            if (c == k-1) {
                if (arr1[i] < arr2[j]) return (long) arr1[i];
                return (long) arr2[j];
            }
            
            if (arr1[i] <= arr2[j]) {
                i++;c++;
            } else if (arr2[j] < arr1[i]) {
                j++;c++;
            }
        }
        
        while (j >= m && i < n) {
            if (c == k-1) return (long) arr1[i];
            i++;c++;
        }
        
        while (i >= n && j < m) {
            if (c == k-1) return (long) arr2[j];
            j++;c++;
        }
        
        return -1;
    }
}
