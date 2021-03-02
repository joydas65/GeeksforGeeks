def areElementsContiguous (arr, n) : 
    #Complete the function
    d = dict()
    
    mn,mx = min(arr),max(arr)
    
    for i in range(mn,mx+1):
        
        d[i] = False
    
    for item in arr:
        
        if item in d:
            
            d[item] = True
            
    for i in range(mn, mx+1):
        
        if d[i] == False:
            
            return False
            
    return True
