def distinctIds(arr : list, n : int, m : int):
    # Complete this function
    d = dict()
    
    for item in arr:
        
        if item in d:
            
            d[item] += 1
            
        else:
            
            d[item] = 1
            
    ar,c,t,v = [],0,0,0
    
    for i in d:
        
        ar.append([i,d[i]])
        
        c += 1
        
    ar = sorted(ar, key = lambda x : x[1])
    
    while m > 0 and t < c:
        
        if m >= ar[t][1]:
            
            m -= ar[t][1]
            
            v += 1
            
        else:
            
            break
        
        t += 1
        
    return c - v
