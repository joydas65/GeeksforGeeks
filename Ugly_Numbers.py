ugly = [0]*((10 ** 4)+1)

ugly[0] = 1

i2,i3,i5 = 0,0,0

next_multiple_of_2 = 2

next_multiple_of_3 = 3

next_multiple_of_5 = 5

for i in range(1,(10**4)+1):
    
    ugly[i] = min(next_multiple_of_2, next_multiple_of_3, next_multiple_of_5)
    
    if ugly[i] == next_multiple_of_2:
        
        i2 += 1
        
        next_multiple_of_2 = ugly[i2]*2
        
    if ugly[i] == next_multiple_of_3:
        
        i3 += 1
        
        next_multiple_of_3 = ugly[i3]*3
        
    if ugly[i] == next_multiple_of_5:
        
        i5 += 1
        
        next_multiple_of_5 = ugly[i5]*5

for _ in range(int(input())):
    
    n = int(input())
    
    print(ugly[n-1])
