def findLongestConseqSubseq(a,n):
    #code here
    
    a = sorted(a)
    
    ans,c = 0,1
    
    for i in range(1,n):
        
        if a[i]-a[i-1] == 1:
            
            c += 1
            
        else:
            
            ans = max(ans, c)
            
            c = 1
            
    return max(ans,c)
