import sys

class Solution:
      
    def firstNonRepeating(self, arr, n): 
          
        # Complete the function
        
        d,minIndex,ans = dict(),sys.maxsize,0
        
        for i,j in enumerate(arr):
            
            d[j] = i
            
        for i in d:
            
            if minIndex > d[i]:
                
                minIndex,ans = d[i],i
                
        return ans
