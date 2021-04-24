class Solution:
    def maximizeMoney(self, N , K):
        # code here 
        if N % 2 == 1:
            
            return ((N//2) + 1) * K
            
        return (N//2) * K
