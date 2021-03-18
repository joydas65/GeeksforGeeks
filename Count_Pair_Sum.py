class Solution:
    def countPairs(self,arr1, arr2, M, N, x):
        #code here.
        
        i,j,ans = 0,N-1,0
        
        while i < M and j >= 0:
            
            if arr1[i] + arr2[j] == x:
                
                ans += 1
                
                i += 1
                
                j -= 1
                
            elif arr1[i] + arr2[j] < x:
                
                i += 1
                
            else:
                
                j -= 1
                
        return ans
