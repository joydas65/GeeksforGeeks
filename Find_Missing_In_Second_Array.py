def findMissing(A,B,N,M):
    # code here
    
    x,ans = set(),[]
    
    for i in B:
        
        x.add(i)
        
    for i in A:
        
        if i not in x:
            
            ans.append(i)
            
    return ans
