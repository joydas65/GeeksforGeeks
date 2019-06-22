for _ in range(int(input())):
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    capacity = int(input())
    
    x,page_faults,frame = 0,0,[]
    
    for i in range(n):
        
        if arr[i] not in frame:
            
            page_faults += 1
            
            if x < capacity:
            
                frame.append(arr[i])
                
                x += 1
                
            else:
                
                frame.remove(frame[0])
                
                frame.append(arr[i])
                
        else:
            
            for j in range(len(frame)):
                
                if frame[j] == arr[i]:
                    
                    frame = frame[:j] + frame[j+1:] + [frame[j]]
                    break
                
    print(page_faults)
