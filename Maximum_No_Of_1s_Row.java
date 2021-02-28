class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int lo,hi,mid;
        int mx = Integer.MIN_VALUE, ans = -1;
        for(int i = 0; i < N; i++){
            lo = 0; hi = M-1;
            while(lo <= hi){
                mid = lo + (hi - lo)/2;
                
                if(Mat[i][mid] == 1)
                hi = mid - 1;
                else
                lo = mid + 1;
            }
            
            if(M - lo > mx){
                mx = M - lo;
                ans = i;
            }
        }
        
        return ans;
    }
}
