for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    m = int(input())
    
    arr = sorted(arr)
    
    ans = arr[m-1] - arr[0]
    
    i,j = 0,n-m
    
    while i <= j:
        
        ans = min(ans,(arr[i+m-1]-arr[i]),arr[j+m-1]-arr[j])
        
        i += 1
        
        j -= 1
        
    print(ans)
