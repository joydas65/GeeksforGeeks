for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    start,end = 0,0
    
    ans = ""
    
    flag = 0
    
    for i in range(1,n):
        
        if arr[i] < arr[i-1]:
            
            end = i - 1
            
            if end != start:
                
                ans = "(" + str(start) + " " + str(end) + ")"
                
                print(ans,end = " ")
                
                ans = ""
                
                start,end = i,i
                
                flag = 1
                
            else:
                
                start,end = i,i
                
        else:
            
            end = i
                
    if end != start:
        
        ans = "(" + str(start) + " " + str(end) + ")"
        
        print(ans)
        
        flag = 1
        
    elif flag == 1 and end == start:
        
        print()
        
    if flag == 0:
        
        print("No Profit")
