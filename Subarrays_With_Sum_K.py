from collections import defaultdict
class Solution:
    def findSubArraySum(self, Arr, N, k):
        # code here
        
        d = defaultdict(lambda : 0)
        
        ans,s = 0,0
        
        for i in Arr:
            
            s += i
            
            if s == k:
                
                ans += 1
                
            if (s-k) in d:
                
                ans += d[s-k]
                
            d[s] += 1
            
        return ans
