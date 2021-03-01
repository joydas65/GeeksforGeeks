class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int start=n,end=-1;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        if(start == n && end == -1)
        ans.add(-1);
        else{
            ans.add(start);
            ans.add(end);
        }
        
        return ans;
    }
}
