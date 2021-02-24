class Solution {
    boolean found = false;
    int ans = -1;
    public boolean check(int k, int n){
        return k >= 0 && k < n ? true : false;
    }
    public void find(int arr[], int n, int lo, int hi){
        if(lo > hi || found == true)
        return;
        
        int mid = lo + (hi - lo)/2;
        
        //System.out.println(mid);
        
        if((mid == n-1 && arr[mid - 1] > arr[mid]) || (check(mid - 1, n) && arr[mid - 1] > arr[mid] && check(mid + 1, n) && arr[mid + 1] > arr[mid])){
            found = true;
            ans = mid;
            return;
        }
        
        find(arr, n, lo, mid - 1);
        find(arr, n, mid + 1, hi);
    }
    int findKRotation(int arr[], int n) {
        // code here
        if(n == 1)
        return 0;
        ans = 0; found = false;
        find(arr, n, 0, n-1);
        
        return ans;
    }
}
