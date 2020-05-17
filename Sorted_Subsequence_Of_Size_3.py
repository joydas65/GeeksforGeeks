import sys

def find3number(A, n):
    # code here
    
    smaller,greater = [-1],[-1 for i in range(n)]
    
    small,great = A[0],A[-1]
    
    small_index,great_index = 0,n-1             # 1 2 1 1 3
    
    for i,j in enumerate(A):
        
        if i >= 1:
            
            if A[i] < small:
                
                smaller.append(small_index)
                
                small,small_index = A[i],i
                
            elif small < j:
                
                smaller.append(small_index)
                
            else:
                
                smaller.append(-1)
    i = n-2
    
    while i >= 0:
        
        if great < A[i]:
            
            greater[i] = great_index
            
            great,great_index = A[i],i
            
        elif A[i] < great:
            
            greater[i] = great_index
            
        else:
            
            greater[i] = -1
            
        i -= 1
        
    #print(smaller,greater)
        
    for i,j in enumerate(smaller):
        
        if j != -1 and greater[i] != -1:
            
            #print(A[j],A[i],A[greater[i]])
            
            if A[j] < A[i] < A[greater[i]]:
            
                return [A[j],A[i],A[greater[i]]]
            
    return []
