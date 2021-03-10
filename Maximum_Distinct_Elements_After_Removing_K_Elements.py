def maxDistinctElements(arr, n, k): 
    #Complete the function

    d,c = dict(),0
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    ar = []
    
    for i in d:
            
        ar.append([i,d[i]])
            
    ar = sorted(ar, key = lambda x : x[1])
    
    #print(ar)
    
    #print(d)
    
    for i in ar:
        
        if k <= 0:
            
            break
        
        d[i[0]] = 1
        
        k -= (i[1] - 1)
        
    for i in d:
            
        c += 1
            
    return c if k <= 0 else c - k
