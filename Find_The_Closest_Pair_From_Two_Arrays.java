class Complete{
    
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        //Complete the function
        
        int i = 0, j = m-1;
        
        int diff = Integer.MAX_VALUE, a = 0, b = 0;
        
        while(i < n && j >= 0){
            int v = Math.abs(arr[i] + brr[j] - x);
            if(v < diff){
                a = arr[i]; b = brr[j];
                diff = v;
            }
            
            if(arr[i] + brr[j] > x)
            j--;
            else
            i++;
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        ans.add(a);
        ans.add(b);
        
        return ans;
    }
}
