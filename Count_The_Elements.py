for _ in range(int(input())):
    
    n = int(input())
    
    arr1 = list(map(int, input().split()))
    
    arr2 = list(map(int, input().split()))
    
    arr2 = sorted(arr2)
    
    for _ in range(int(input())):
        
        m = int(input())
        
        lo,hi = 0,n-1
        
        while lo <= hi:
            
            mid = lo + (hi - lo)//2
            
            if arr2[mid] > arr1[m]:
                
                hi = mid - 1
                
            else:
                
                lo = mid + 1
                
        print(lo)
