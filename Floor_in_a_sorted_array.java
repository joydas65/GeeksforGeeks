class FloorSearch{
    
    // Function to find floor of x
    // arr: input array
    // left and right as 0 and n-1, where n is the size of array
    static int findFloor(long arr[], int left, int right, long x)
    {
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;
            
            if(arr[mid] <= x)
            return findFloor(arr, mid + 1, right, x);
            else if(arr[mid] < x)
            left = mid + 1;
            else
            right = mid - 1;
        }
        return right;
    }
    
}
