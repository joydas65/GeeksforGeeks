from collections import Counter

def areKAnagrams(str1, str2, k):
    # Code here
    n,m = len(str1),len(str2)
    
    if n != m:
        
        return False
        
    diff = Counter(str1) - Counter(str2)
    
    if sum(diff.values()) > k:
        
        return False
        
    return True
