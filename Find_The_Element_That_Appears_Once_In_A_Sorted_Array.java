class Solution 
{
    int ans = -1;
    
    public boolean check(int x, int n){
        return x >= 0 && x < n ? true : false;
    }
    
    public void find(int arr[], int lo, int hi, int n){
        if(lo > hi)
        return;
        
        int mid = lo + (hi - lo)/2;
        
        if(check(mid-1, n) && arr[mid-1] != arr[mid] && check(mid+1, n) && arr[mid+1] != arr[mid])
        ans = arr[mid];
        
        if(mid == n-1 && arr[mid] != arr[mid-1])
        ans = arr[mid];
        
        if(mid == 0 && arr[1] != arr[0])
        ans = arr[mid];
        
        if(ans != -1)
        return;
        
        find(arr, lo, mid - 1, n);
        find(arr, mid + 1, hi, n);
    }
    int findOnce(int arr[], int n)
    {
        // Complete this function
        if(n == 1)
        return arr[0];
        ans = -1;
        find(arr, 0, n-1, n);
        return ans;
    }
}
