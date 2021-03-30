class Solution:

    def maxChars(self, s):
        # code here
        
        d,ans = dict(),-1
        
        for i,j in enumerate(s):
            
            if j in d:
                
                d[j].append(i)
                
            else:
                
                d[j] = [i]
                
        for i in d:
            
            if d[i][0] != d[i][-1]:
                
                ans = max(ans, d[i][-1] - d[i][0] - 1)
                
        #print(d)
                
        return ans
