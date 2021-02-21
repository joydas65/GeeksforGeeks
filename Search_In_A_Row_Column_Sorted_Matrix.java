class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int lo, hi, mid;
	    for(int i = 0; i < n; i++){
	        lo = 0; hi = m-1;
	        while(lo <= hi){
	            mid = lo + (hi - lo)/2;
	            
	            if(matrix[i][mid] == x)
	            return true;
	            else if(matrix[i][mid] > x)
	            hi = mid - 1;
	            else
	            lo = mid + 1;
	        }
	    }
	    
	    return false;
	} 
} 
