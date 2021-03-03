class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int xor = 0;
        
        for(int item : arr){
            xor = xor ^ item;
        }
        
        return xor;
    }
}
