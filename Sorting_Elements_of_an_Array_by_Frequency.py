def sortByFreq(a,n):
    #code here
    
    d = dict()
    
    for i in a:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
    
    arr = []
    
    for i in d:
        
        arr.append((i,d[i]))
        
    arr = sorted(arr, key = lambda x : x[1], reverse = True)
    
    for i in arr:
        
        for j in range(i[1]):
            
            print(i[0],end = " ")
            
    print()
    
    
