class Solution:
    def firstNonRepeating(self, arr, n): 
        # Complete the function
        
        d = dict()
        
        for i in arr:
            
            if i in d:
                
                d[i] += 1
                
            else:
                
                d[i] = 1
                
        for i in arr:
            
            if d[i] == 1:
                
                return i
                
        return 0
