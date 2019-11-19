def callSubArray(arr, lb, ub):
    
    if lb <= ub:
        
        mid = (lb + ub)//2
        
        print(arr[mid],end = " ")
        
        callSubArray(arr, lb, mid - 1)
        
        callSubArray(arr, mid + 1, ub)

for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    callSubArray(arr, 0, n-1)
    
    print()
