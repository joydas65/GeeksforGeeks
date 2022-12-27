class Solution{
    
    String longestCommonPrefix(String arr[], int n){
        // code here
        int i = 0, j = 0, minL = Integer.MAX_VALUE;
        
        for (String word : arr) {
            minL = Math.min(minL, word.length());
        }
        
        while (i < minL) {
            for (j = 1; j < n; j++) {
                if (arr[j].charAt(i) != arr[j-1].charAt(i)) break;
            }
            
            if (j < n) break;
            
            i++;
        }
        
        return i == 0 ? "-1" : arr[0].substring(0,i);
    }
}
