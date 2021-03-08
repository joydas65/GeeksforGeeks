class Solution:
    def findPairs(self,a,n):
        #code here.
        
        products = set()
        
        for i in range(n):
            
            for j in range(i+1,n):
                
                if a[i]*a[j] in products:
                    
                    return 1
                
                products.add(a[i]*a[j])
                
        return -1
