class Solution:
    def secFrequent(self, arr, n):
        # code here
        
        d,ans,x = dict(),0,0
        
        for i in arr:
            
            if i in d:
                
                d[i] += 1
                
            else:
                
                d[i] = 1
                
        
            ans = max(ans, d[i])
            
        for i in d:
            
            if d[i] != ans and x < d[i]:
                
                an,x = i,d[i]
                
        return an
