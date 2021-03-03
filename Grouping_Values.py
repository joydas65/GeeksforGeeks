class Solution:
    def isPossible(self, N, arr, K):
        # code here
        d = dict()
        
        for i in arr:
            
            if i in d:
                
                d[i] += 1
                
            else:
                
                d[i] = 1
                
        for i in d:
            
            if d[i] > K*2:
                
                return 0
                
        return 1
