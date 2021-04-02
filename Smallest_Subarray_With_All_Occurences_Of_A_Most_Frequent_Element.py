import sys

def smallestSubsegment (arr,  n) : 
    #Complete the function
    
    d,mx = dict(),0
    
    for i,j in enumerate(arr):
        
        if j in d:
            
            d[j][0] += 1
            
            d[j][1].append(i)
            
        else:
            
            d[j] = [1,[i]]
            
        if mx < d[j][0]:
            
            mx = d[j][0]
            
    ans,c,start,end = [],sys.maxsize,-1,-1
    
    for i in arr:
        
        if d[i][0] == mx:
            
            if c > (d[i][1][-1] - d[i][1][0]) + 1:
                
                c = (d[i][1][-1] - d[i][1][0]) + 1
                
                start,end = d[i][1][0],d[i][1][-1]
                
    for i in range(start,end+1):
        
        ans.append(arr[i])
                
    return ans
