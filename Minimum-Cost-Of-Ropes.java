// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pQueue = new PriorityQueue<Long>();
        
        int i = 0;
        
        long ans = 0, t1 = -1, t2 = -1;
        
        for (i = 0; i < n; i++) {
            pQueue.add(arr[i]);
        }
        
        i = 1;
        
        while (!pQueue.isEmpty()) {
            try {
                t1 = pQueue.poll();
                t2 = pQueue.poll();
                pQueue.add(t1 + t2);
            }
            catch (NullPointerException ex) {
                break;
            }
            ans += (t1 + t2);
        }
        
        return ans;
    }
}
