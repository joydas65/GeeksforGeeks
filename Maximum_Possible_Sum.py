class Solution:
    def returnMaxSum(self, a, b, n):
        # Your code goes here
        
        d,c,start,ans,i = dict(),0,0,0,0
        
        while i < n:
            
            if a[i] in d and d[a[i]] > 0:
                
                c -= b[start]
                
                d[a[start]] = 0
                
                start += 1
                
                if a[i] in d and d[a[i]] == 0:
                    
                    c += b[i]
                    
                    d[a[i]] = 1
                    
                    i += 1
                
            else:
                
                d[a[i]] = 1
                
                c += b[i]
                
                i += 1
                
            ans = max(ans, c)
                
        return ans
