def countFreq(a, n):
    #Complete the function
    ans,a,c = [],sorted(a),1
    
    for i,j in enumerate(a):
        
        if i >= 1:
            
            if j == a[i-1]:
                
                c += 1
                
            else:
                
                ans.append(c if ans == [] else c + ans[-1])
                
                c = 1
                
    ans.append(c if ans == [] else c + ans[-1])
    
    return ans
