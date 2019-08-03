for _ in range(int(input())):
    
    n,m = map(int, input().split())
    
    arr1 = list(map(int, input().split()))
    
    arr2 = list(map(int, input().split()))
    
    s1,s2 = set(arr1),set(arr2)
    
    ans = 0
    
    for i in s1:
        
        if i in s2:
            
            ans += 1
            
    print(ans)
