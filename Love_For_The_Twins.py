for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    d = dict()
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    ans = 0
    
    for i in d:
        
        ans += (d[i]//2)
        
    print(ans*2)
