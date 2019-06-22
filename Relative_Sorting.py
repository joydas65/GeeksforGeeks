for _ in range(int(input())):
    
    n,m = map(int, input().split())
    
    a1 = list(map(int, input().split()))
    
    a2 = list(map(int, input().split()))
    
    d,x,t = dict(),set(),[]
    
    for i in a2:
        
        x.add(i)
    
    for i in a1:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in d:
        
        if i not in x:
            
            t.append(i)
            
    t = sorted(t)
    
    for i in a2:
        
        if i in d:
            
            for j in range(d[i]):
                
                print(i,end = " ")
                
    for i in t:
        
        if i in d:
            
            for j in range(d[i]):
                
                print(i,end = " ")
        
    print()
