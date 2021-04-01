class Solution:
    def isLuckyOrNot(self, N):
        # code here
        
        s = str(N)
        
        i,n,j,seen,flag = 1,len(s),0,set(),False
        
        while i <= n:
            
            j = 0
            
            while j+i <= n:
                
                prod = 1
            
                for v in s[j:j+i]:
                    
                    prod = prod * (ord(v) - 48)
                    
                if prod not in seen:
                    
                    seen.add(prod)
                    
                else:
                    
                    flag = True
                    
                    break
                
                j += 1
                
            if flag == True:
                
                break
            
            i += 1
            
        if flag == True:
            
            return 0
            
        return 1
