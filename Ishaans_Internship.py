for _ in range(int(input())):
    
    n,k = map(int, input().split())
    
    ans = 1
    
    while n >= k:
        
        ans = ans * k
        
        n = n // k
        
    print(ans)
