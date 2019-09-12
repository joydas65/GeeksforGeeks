for _ in range(int(input())):
    
    n,m,x = map(int, input().split())
    
    arr1 = list(map(int, input().split()))
    
    arr2 = list(map(int, input().split()))
    
    ans = []
    
    t1,t2,f = set(arr1),set(arr2),0
    
    for i in arr1:
        
        if (x - i) in t2:
            
            ans.append((i, x-i))
            
            f = 1
            
    if f == 0:
        
        print("-1")
        
    else:
            
        ans = sorted(ans)
        
        v = len(ans)
        
        for i in range(v):
            
            if i == v - 1:
                
                print(ans[i][0],ans[i][1],end="")
                
            else:
                
                print("{one} {two}, ".format(one = ans[i][0], two = ans[i][1]),end = "")
                
        print()
                
                
