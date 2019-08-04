def printNonRepeated(arr,n):
    #Your code here
    
    d = dict()
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in arr:
        
        if d[i] == 1:
            
            print(i,end = " ")
            
    #print()
