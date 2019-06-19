for _ in range(int(input())):
    
    s1 = input()
    
    d,flag = dict(),0
    
    for i in s1:
        
        if i in d:
            
            print(i)
            flag = 1
            break
        
        else:
            d[i] = 1
            
    if flag == 0:
        
        print("-1")
