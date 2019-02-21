def remove_duplicate(n, arr):
    #Code here
    
    i,j = 0,1
    
    while j < n:
        
        if arr[i] != arr[j]:
            
            i += 1
            
            arr[i] = arr[j]
            
        j += 1
        
    return i + 1
