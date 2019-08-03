for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(str, input().split()))
    
    ans,flag = [],0
    
    x = {'1', '2', '3'}
    
    for i in arr:
        
        for j in i:
            
            if j not in x:
                
                flag = 1
                
                break
        
        if flag == 0:
            
            ans.append(int(i))
            
        flag = 0
            
    if ans == []:
        
        print("-1")
        
    else:
        
        ans = sorted(ans)
        
        for i in ans:
            
            print(i,end = " ")
            
        print()
    
    
