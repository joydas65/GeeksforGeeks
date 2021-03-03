for _ in range(int(input())):
    
    n,k = map(int, input().split())
    
    arr = list(map(int, input().split()))
    
    d = dict()
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    ans = -1
            
    for i in arr:
        
        if d[i] == k:
            
            ans = i
            
            break
        
    print(ans)
