for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    d,ar,c = dict(),[],0
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in d:
        
        ar.append([i,d[i]])
        
        c += 1
        
    ar,i = sorted(ar, reverse = True, key = lambda x : x[1]),0
    
    #print(ar)
    
    while i < c:
        
        for _ in range(ar[i][1]):
            
            print(ar[i][0],end = " ")
            
        i += 1
        
    print()
