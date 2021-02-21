class Solution {
    int lo = -1, hi = -1;
    public boolean checkBoundary(int v, int n){
        return v >= 0 && v < n ? true : false;
    }
    public void find(int[] arr, int n, int lb, int ub, int x){
        if(lb > ub)
        return;
        
        int mid = lb + (ub - lb)/2;
        
        if(checkBoundary(lo-1,n) && arr[lo-1] < x && checkBoundary(hi+1,n) && arr[hi+1] > x)
        return;
        
        if(arr[mid] < x)
        find(arr, n, mid + 1, ub, x);
        else if(arr[mid] > x)
        find(arr, n, lb, mid - 1, x);
        else{
            lo = Math.min(lo, mid);
            hi = Math.max(hi, mid);
            find(arr, n, mid + 1, ub, x);
            find(arr, n, lb, mid - 1, x);
        }
    }
    int count(int[] arr, int n, int x) {
        // code here
        lo = n+1; 
        find(arr, n, 0, n-1, x);
        if(lo == n+1 && hi == -1)
        return 0;
        return hi - lo + 1;
    }
}
