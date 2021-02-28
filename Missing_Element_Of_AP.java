class Solution {
    boolean found = false;
    int ans = -1;
    public boolean valid(int x, int n){
        return x >= 0 && x < n ? true : false;
    }
    public void find(int arr[], int n, int lo, int hi){
        if(lo > hi || found == true)
        return;
        
        int mid = lo + (hi-lo)/2;
        
        int d = -1;
        
        if(valid(mid-1, n)){
            d = arr[mid]-arr[mid-1];
        }
        
        if(d > -1 && valid(mid+1, n)){
            if(arr[mid+1]-arr[mid] > d){
                ans = arr[mid] + d;
                found = true;
                return;
            }else if(arr[mid+1]-arr[mid] < d){
                ans = arr[mid]-(arr[mid+1]-arr[mid]);
                found = true;
                return;
            }
        }
        
        find(arr, n, lo, mid - 1);
        find(arr, n, mid + 1, hi);
    }
    int findMissing(int[] arr, int n) {
        // code here
        if(n == 2){
            return arr[0] + (arr[1] - arr[0])/2;
        }
        found = false;
        ans = -1;
        //System.out.print(arr[1]-arr[0]);
        find(arr, n, 0, n-1);
        return ans;
    }
}
