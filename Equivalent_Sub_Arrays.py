class Solution:
    def countDistinctSubarray(self,arr, n): 
        #code here.
        
        x,c = dict(),0
        
        for i in arr:
            
            x[i] = 1
            
        c = len(x)
                
        d,right,window,ans = dict(),0,0,0
        
        for left in range(n):
            
            while right < n and window < c:
                
                if arr[right] in d:
                    
                    d[arr[right]] += 1
                    
                else:
                    
                    d[arr[right]] = 1
                    
                if d[arr[right]] == 1:
                    
                    window += 1
                    
                right += 1
                    
            if window == c:
                
                ans += (n - right + 1)
                
            d[arr[left]] -= 1
            
            if d[arr[left]] == 0:
                
                window -= 1
                
        return ans
