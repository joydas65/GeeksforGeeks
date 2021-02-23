class Solution
{
    int ans = -1; boolean flag = false;
    public boolean check(int x, int n){
        return x >= 0 && x < n ? true : false;
    }
    public void find(int lo, int hi, int arr[], int n){
        if(lo > hi || flag == true)
        return;
        
        int mid = lo + (hi - lo)/2;
        
        if(check(mid + 1, n) && arr[mid + 1] > arr[mid] && check(mid - 1, n) && arr[mid - 1] > arr[mid]){
            flag = true;
            ans = arr[mid];
        }
        
        ans = Math.min(ans, arr[mid]);
        
        find(lo, mid - 1, arr, n);
        
        find(mid + 1, hi, arr, n);
    }
    int findMin(int arr[], int n)
    {
        //complete the function here
        ans = Integer.MAX_VALUE;
        flag = false;
        find(0, n-1, arr, n);
        return ans;
    }
}
