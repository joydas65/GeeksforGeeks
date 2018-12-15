for _ in range(int(input())):
    
    n,k = map(int, input().split())
    
    arr = list(map(int, input().split()))
    
    arr = sorted(arr)
    
    minans = 0
    
    maxans = 0
    
    lb = 0
    
    ub = n - 1
    
    while lb <= ub:
        
        minans += arr[lb]
        
        lb += 1
        
        ub -= k
        
    lb = 0
    
    ub = n - 1
    
    while ub >= lb:
        
        maxans += arr[ub]
        
        ub -= 1
        
        lb += k
        
    print(minans,maxans)
