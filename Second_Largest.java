class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int mx = -1, secondmx = -1;
        for(int item : arr){
            if(mx < item)
            mx = item;
        }
        
        for(int item : arr){
            if(item != mx && secondmx < item)
            secondmx = item;
        }
        
        return secondmx;
    }
}
