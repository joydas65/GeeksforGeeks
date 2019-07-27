def maximumMeetings(n,start,end):
    
    arr = []
    
    for i in range(n):
        
        arr.append((start[i],end[i],i+1))
        
    arr = sorted(arr, key = lambda x : x[1])
    
    print(arr[0][2],end = " ")
    
    end = arr[0][1]
    
    for i in range(1,n):
        
        if arr[i][0] > end:
            
            print(arr[i][2],end = " ")
            
            end = arr[i][1]
            
    print()
    
    #print(arr)
