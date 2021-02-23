class Solution 
{ 
    static boolean found = false;
    static int index = -1;
    public static void find(int lo, int hi, int arr[], int x){
        if(lo > hi || found == true)
        return;
        
        int mid = lo + (hi - lo)/2;
        
        if(arr[mid] == x){
            index = mid;
            found = true;
            return;
        }
        
        find(lo, mid - 1, arr, x);
        
        find(mid + 1, hi, arr, x);
    }
    static int Search(int array[], int target)
	{
	    // code here
	    found = false;
	    index = -1;
	    find(0, array.length - 1, array, target);
	    
	    return index;
	}
} 
