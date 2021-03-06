class Solution
{ 
    public int findPairs(int arr[],int n) 
    { 
        //code here.
        HashSet<Integer> seen = new HashSet<Integer>();
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(seen.contains(arr[i] + arr[j]))
                return 1;
                seen.add(arr[i] + arr[j]);
            }
        }
        
        return 0;
    }
}
