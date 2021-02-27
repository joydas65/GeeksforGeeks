def greaterElement (arr,  n) : 
    #Complete the function
    
    ar,ans = [],[-1 for i in range(n)]
    
    for i,j in enumerate(arr):
        
        ar.append([j,i])
        
    ar = sorted(ar)
    
    for i in range(n-1,-1,-1):
        
        if i == n-1:
        
            ans[ar[i][1]] = -10000000
            
        else:
            
            lo,hi = 0,n-1
            
            while lo <= hi:
                
                mid = lo + (hi - lo)//2
                
                if ar[mid][0] <= ar[i][0]:
                    
                    lo = mid + 1
                    
                else:
                    
                    hi = mid - 1
                    
            if lo < n:
                    
                ans[ar[i][1]] = str(ar[lo][0])+" "
                
            else:
                
                ans[ar[i][1]] = -10000000
            
    #print(ans)
            
    return ans
