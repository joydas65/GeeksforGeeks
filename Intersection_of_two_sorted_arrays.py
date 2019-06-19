def mergeArrays(a, n, b, m):
    # code here
    
    s = set()
    
    for i in a:
        
        s.add(i)
        
    x,flag = set(),0
        
    for i in b:
        
        if i in s and i not in x:
            
            print(i,end = " ")
            
            x.add(i)
            
            flag = 1
            
    if flag == 0:
        
        print("-1",end = " ")
