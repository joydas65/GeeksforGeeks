class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int lo = 0, hi = n-1, mid, ans = -1;
        
        while(lo <= hi){
            mid = lo + (hi - lo)/2;
            
            if(mid-1 >= 0 && arr[mid-1] > arr[mid])
            hi = mid - 1;
            else
            lo = mid + 1;
        }
        
        return arr[hi];
    }
}
