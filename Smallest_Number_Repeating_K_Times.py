class Solution:
    def findDuplicate(self, arr, N, K):
        
        d,ans = dict(),sys.maxsize
        
        for i in arr:
            
            if i in d:
                
                d[i] += 1
            else:
                d[i] = 1
                
        for i in d:
            
            if d[i] == K and ans > i:
                
                ans = i
                
        return -1 if ans == sys.maxsize else ans
