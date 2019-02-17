for _ in range(int(input())):
    
    n,k = map(int, input().split())
    
    arr = list(map(int, input().split()))
    
    dis = set()
    
    i = 0
    
    while i+k <= n:
        
        for j in range(i,i+k):
            
            dis.add(arr[j])
            
        print(len(dis),end = " ")
        
        dis = set()
        
        i += 1
        
    print()
            
        
