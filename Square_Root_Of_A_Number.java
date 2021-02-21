class SquareRoot
{
     long floorSqrt(long x)
	 {
		// Your code here
		if(x == 1)
		return x;
		long lo = 1, hi = x/2, mid;
		
		while(lo <= hi){
		    mid = lo + (hi - lo)/2;
		    
		    if(mid*mid < x)
		    lo = mid + 1;
		    else if(mid*mid > x)
		    hi = mid - 1;
		    else
		    return mid;
		}
		
		return hi;
	 }
}
