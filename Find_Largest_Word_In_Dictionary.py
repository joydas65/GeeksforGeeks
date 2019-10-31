for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(str, input().split()))
    
    word = input()
    
    d = dict()
    ans,ans_str = 0,""
    
    for i in word:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in arr:
        n = len(i)
        
        flag = 0
        temp = dict()
        
        for j in i:
            
            if j not in d:
                
                flag = 1
                break
            
            else:
                
                if j in temp:
                    
                    temp[j] += 1
                    
                else:
                    
                    temp[j] = 1
            
        if flag == 0:
            
            for j in temp:
                
                if temp[j] > d[j]:
                    
                    flag = 1
                    break
                
            if flag == 0:
                
                if ans < n:
                    
                    ans = n
                    
                    ans_str = i
                    
    print(ans_str)
