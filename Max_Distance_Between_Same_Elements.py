def maxDistance(arr, n):
    # Code here
    
    d = dict()
    
    for i,j in enumerate(arr):
        
        if j in d:
            
            d[j][1] = i
            
        else:
            
            d[j] = [i,i]
            
    ans = -1
            
    for i in d:
        
        ans = max(ans, d[i][1] - d[i][0])
        
    return ans
