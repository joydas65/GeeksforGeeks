# Your task is to complete this function
# Function should return True/False or 1/0
def PalinArray(arr ,n):
    # Code here
    c = 0
    
    for num in arr:
        
        if str(num) == str(num)[::-1]:
            c += 1
            
    return 1 if c == n else 0
