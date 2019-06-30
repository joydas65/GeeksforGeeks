for _ in range(int(input())):
    
    n = int(input())
    
    arr_A = list(map(int, input().split()))
    
    arr_B = list(map(int, input().split()))
    
    arr_A = sorted(arr_A)
    
    arr_B = sorted(arr_B)
    
    i,ans = 0,0
    
    while i < n:
        
        ans += (arr_A[i]*arr_B[n-1-i])
        
        i += 1
        
    print(ans)
