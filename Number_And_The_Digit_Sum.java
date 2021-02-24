class Sol
{
    public static boolean check(long n, long k){
        long sum = 0, temp = n;
        while(n != 0){
            sum += (n % 10);
            n /= 10;
        }
        
        return temp - sum >= k ? true : false;
    }
    public static long numberCount (long N, long K)
    {
        // your code here
        long lo = 1, hi = N, mid;
        
        while(lo <= hi){
            mid = lo + (hi - lo)/2;
            
            if(check(mid, K))
            hi = mid - 1;
            else
            lo = mid + 1;
            
            //System.out.println("lo = "+lo+" hi = "+hi);
        }
        
        //System.out.println(hi);
        
        return N - lo + 1;
    }
}
