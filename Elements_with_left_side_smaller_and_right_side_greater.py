for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    ltb = [0 for i in range(n)]
    
    rtb = [0 for i in range(n)]
    
    ltb[1] = arr[0]
    
    rtb[n-2] = arr[n-1]
    
    left_theke_boro,right_theke_choto = ltb[1],rtb[n-2]
    
    for i in range(2,n-1):
        
        ltb[i] = max(left_theke_boro,arr[i-1])
        
        left_theke_boro = ltb[i]
        
    for i in range(n-3,0,-1):
        
        rtb[i] = min(right_theke_choto,arr[i+1])
        
        right_theke_choto = rtb[i]
        
    flag = 0
        
    for i in range(1,n):
        
        if ltb[i] <= arr[i] and rtb[i] >= arr[i]:
            
            flag = 1
            
            break
            
    if flag == 1:
            
        print(arr[i])
        
    else:
        
        print("-1")
