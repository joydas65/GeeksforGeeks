for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    x = set()
    
    for i in arr:
        
        x.add(i)
        
    for i in range(n+1):
        
        if i not in x:
            
            print(i,end = " ")
            
    print()
