class Solution:
    def pairCount(self, N, A, B, C):
        # code here
        
        d,ans = dict(),0
        
        for i in C:
            
            if i in d:
                
                d[i] += 1
                
            else:
                
                d[i] = 1
                
        for i,j in enumerate(A):
            
            diff = j - B[i]
            
            if diff in d:
                
                ans += 1
                
        return ans
