class Solution:

    def longestKSubstr(self, s, k):
        # code here    
    
        d,i,c,n,start,ans = dict(),0,0,len(s),0,0
        
        while i < n:
            
            if (c == k and s[i] not in d) or (s[i] in d and d[s[i]] <= 0):
                
                ans = max(ans, i-start)
                
                d[s[start]] -= 1
                
                if d[s[start]] <= 0:
                    
                    d[s[i]] = 1
                    
                    i += 1
                    
                start += 1
                
            else:
                
                if s[i] in d:
                    
                    d[s[i]] += 1
                    
                else:
                    
                    d[s[i]] = 1
                    
                    c += 1
                    
                i += 1
                
        #print(i,start)
            
        return -1 if ans == 0 and c < k else max(ans, i-start)
