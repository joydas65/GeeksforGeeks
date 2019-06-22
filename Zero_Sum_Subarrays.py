for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    d = dict()
    
    d[0] = 1
    
    s,ans = 0,0
    
    for i in arr:
        
        s += i
        
        if s in d:
            
            ans += d[s]
            
            d[s] += 1
            
        else:
            
            d[s] = 1
            
    print(ans)
