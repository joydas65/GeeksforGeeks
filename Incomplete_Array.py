class Solution:
    def countElements(self,N,A):
        #code here
        mn,mx,c,x = min(A),max(A),0,set()
        
        for i in A:
            
            if i > mn and i < mx and i not in x:
                
                c += 1
                
                x.add(i)
                
        #print(mn,mx)
                
        return 0 if mx == mn else (mx-1) - (mn+1) + 1 - c
