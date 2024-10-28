class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        Map<Integer, Integer> positions = new HashMap<>();
        int n = nums.length, ans = 0;
        if (n == 1) return 0;
        
        for (int i = 0; i < n; i++) {
            positions.put(nums[i], i);
        }
        
        int[] numsCopy = new int[n];
        
        for (int i = 0; i < n; i++) {
            numsCopy[i] = nums[i];
        }
        
        Arrays.sort(numsCopy);
        
        for (int i = 0; i < n; i++) {
            if (numsCopy[i] != nums[i]) {
                int pos = positions.get(numsCopy[i]);
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                ans++;
                positions.put(temp, pos);
            }
        }
        return ans;
    }
}
