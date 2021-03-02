class Solution
{
    public boolean check(int mid, int n){
        int c = 0, f = 5;
        while(f <= mid){
            c += mid/f;
            f = f * 5;
        }
        
        return c >= n;
    }
    int findNum(int n)
    {
        // Complete this function
        if(n == 1)
        return 5;
        
        int lo = 0, hi = 5*n, mid;
        
        while(lo < hi){
            mid = (lo + hi)/2;
            
            if(check(mid, n))
            hi = mid;
            else
            lo = mid + 1;
        }
        
        return lo;
    }
}
