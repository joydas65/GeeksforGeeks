class Solution:
    def distinct(self, M, N):
        # code here
        
        d,c = dict(),0
        
        for i in range(N):
            
            for j in range(N):
                
                if M[i][j] not in d:
                    
                    d[M[i][j]] = set()
                    
                    d[M[i][j]].add(i)
                    
                else:
                    
                    d[M[i][j]].add(i)
                    
        for i in d:
            
            if len(d[i]) >= N:
                
                c += 1
                
        return c
