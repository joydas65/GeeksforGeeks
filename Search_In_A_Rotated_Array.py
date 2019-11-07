for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    elem = int(input())
    
    try:
        
        print(arr.index(elem))
        
    except ValueError:
        
        print("-1")
