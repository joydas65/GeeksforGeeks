for _ in range(int(input())):
    
    n = int(input())
    
    s = list(map(str, input().split()))
    
    inp_string = input()
    
    len_inp = len(inp_string)
    
    d = set()
    
    for i in s:
        
        d.add(i)
    
    x,flag = "",0
    
    for i,j in enumerate(inp_string):
        
        x += j
        
        if x in d:
            
            if i+1 == len_inp:
                
                flag = 1
            
                break
            #print("Hi",x,i)
            
            x = ""
            
            if inp_string[i+1:] in d:
                
                flag = 1
                
                break
            
    if flag == 1:
        
        print(flag)
        
    else:
                
        if x in d and i+1 == len_inp:
            
            flag = 1
                    
        print(flag)
