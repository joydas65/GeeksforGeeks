class Solution:
    def findSubarraySum(self,arr, n, Sum):  
        #code here
        s,ans,d = 0,0,dict()
        
        for i in arr:
            
            s += i
            
            if s == Sum:
                
                ans += 1
                
            if s - Sum in d:
                
                ans += d[s - Sum]
                
            if s in d:
                
                d[s] += 1
                
            else:
                
                d[s] = 1
                
        return ans
