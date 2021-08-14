for _ in range(int(input())):

    n = int(input())
    
    arr = list(map(int, input().split()))
    
    s,c = 0,0
    
    while n >= 1:
        
        if c % 2 == 0:
            
            s += (arr[n-1]*arr[n-1])
            
        else:
            
            s -= (arr[n-1]*arr[n-1])
            
        n -= 1
        
        c += 1
        
    print(s)
