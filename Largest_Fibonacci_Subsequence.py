class Solution:
    def getMaxandMinProduct(self, arr, n):
        # code here
        x = 10**9
        
        seen = set()
        
        seen.add(0)
        seen.add(1)
        
        c,a,b = 1,0,1
        
        while c <= x:
            
            seen.add(c)
            a,b = b,c
            
            c = a+b
            
        ans = []
        
        for i in arr:
            
            if i in seen:
                
                ans.append(i)
                
        return ans
