class Leader{
    static ArrayList<Integer> leaders(int arr[], int n){
        
        int x[] = new int[arr.length];
        int index=-1,maxSoFar = arr[arr.length-1];
        x[++index] = maxSoFar;
        
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i] >= maxSoFar){
                x[++index] = arr[i];
                maxSoFar = arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = index; i >= 0; i--){
            ans.add(x[i]);
        }
        return ans;
     
    }
    
}
