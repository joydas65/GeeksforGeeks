for _ in range(int(input())):
    
    n,k = map(int, input().split())
    
    arr = list(map(int, input().split()))
    
    arr = sorted(arr)
    
    #print(arr)
    
    i,x = 0,0
    
    while x <= k and i < n:
        
        x += arr[i]
        
        if x > k:
            
            break
        
        i += 1
        
    print(i)
