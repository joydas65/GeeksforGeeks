for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    for i in range(n-1):
        
        if arr[i] > arr[i + 1]:
            
            print("{one} ".format(one = arr[i + 1]),end = "")
            
        else:
            
            print("-1 ",end = "")
            
    print("-1")
