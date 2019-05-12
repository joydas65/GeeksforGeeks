def decimalValue(head):
    MOD=10**9+7
    # Code here
    if head is None:
        return 0
    else:
        f,c,x,ans = head,0,0,0
        
        while f is not None:
            
            c += 1
            
            f = f.next
            
        while head is not None:
            
            x += 1
            
            if head.data == 1:
                
                ans += (2**(c-x))
                
            head = head.next
                
        return ans%MOD
