class SearchElement{

    static int ternarySearch(int arr[], int N, int K)
    {
        
        // Your code here
        int lo = 0,hi = N-1, mid1, mid2;
        
        while(lo <= hi){
            mid1 = lo + (hi - lo)/3;
            
            mid2 = hi - (hi - lo)/3;
            
            if(arr[mid1] == K || arr[mid2] == K)
            return 1;
            
            if(arr[mid1] <= K && K <= arr[mid2]){
                lo = mid1 + 1;
                hi = mid2 - 1;
            }else if(K <= arr[mid1]){
                hi = mid1 - 1;
            }else if(K >= arr[mid2]){
                lo = mid2 + 1;
            }
        }
        
        return -1;
    }
}
