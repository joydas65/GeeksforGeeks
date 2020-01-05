for _ in range(int(input())):
    
    s = input()
    
    d,x,n = dict(),set(),len(s)
    
    for i in s:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
        x.add(i)
        
    dis = len(x)
    
    if n % dis == 0:
        flag = 0
        
        for i in s:
            
            if d[i] != (n//dis):
                
                print(0)
                flag = 1
                break
            
        if flag == 0:
        
            print(1)
        
    elif (n-1) % dis == 0:
        
        v,flag,c = (n-1)//dis,0,0
        
        for i in s:
            
            if d[i] < v or d[i] > (v+1):
                flag = 1
                break
            
            if v == d[i]:
                
                c += 1
                
        if flag == 1:
            print(0)
        else:
            if (dis-1) == c:
                print(1)
            else:
                print(0)
            
    else:
        m1,m2 = 10001,0
        
        for i in s:
            
            m1 = min(m1, d[i])
            m2 = max(m2, d[i])
            
        if (m2-m1) == 1:
            
            c = 0
            
            for i in s:
                
                if d[i] == m2:
                    
                    c += 1
                    
            if c == 1 or c == (n - 1):
                
                print(1)
                
            else:
                print(0)
            
        else:
        
            print(0)
