class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int lo = 0, hi = n-1, mid;
        
        while(lo <= hi){
            mid = lo + (hi - lo)/2;
            
            if(arr[mid] == 1)
            lo = mid + 1;
            else
            hi = mid - 1;
        }
        
        return n - lo;
    }

}
