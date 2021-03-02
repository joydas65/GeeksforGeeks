for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    x,ans = set(),0
    
    for i in arr:
        
        if i not in x:
            
            ans += 1
            
            x.add(i)
            
    print(ans)
