for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    left,right = 0,n-1
    
    while left < right:
        
        if arr[left] == 0 and arr[right] == 0:
            
            left += 1
            
        elif arr[left] == 1 and arr[right] == 1:
            
            right -= 1
            
        elif arr[left] == 0 and arr[right] == 1:
            
            left += 1
            
            right -= 1
            
        else:
            
            arr[left],arr[right] = arr[right],arr[left]
            
            left += 1
            
            right -= 1
            
    for i in arr:
        
        print(i,end = " ")
        
    print()
