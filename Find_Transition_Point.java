class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int lo = 0, hi = n-1, mid;
        
        while(lo <= hi){
            mid = lo + (hi - lo)/2;
            
            if(arr[mid] == 1)
            hi = mid - 1;
            else
            lo = mid + 1;
        }
        
        return lo < n ? lo : -1;
    }
}
