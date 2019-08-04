def QuadraticProbing( hash, hashSize, arr, sizeOfArray):
    #Your code here
    
    for i in arr:
        
        if hash[i % hashSize] == -1:
            
            hash[i % hashSize] = i
            
        else:
            
            j = 1
            
            while hash[(i + (j*j)) % hashSize] != -1:
                
                j += 1
                
            hash[(i + (j*j))%hashSize] = i
            
    return hash
    
    
