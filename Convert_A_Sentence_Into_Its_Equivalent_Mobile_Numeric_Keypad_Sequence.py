d = dict()

d['A'],d['B'],d['C'] = 2,22,222

d['D'],d['E'],d['F'] = 3,33,333

d['G'],d['H'],d['I'] = 4,44,444

d['J'],d['K'],d['L'] = 5,55,555

d['M'],d['N'],d['O'] = 6,66,666

d['P'],d['Q'],d['R'],d['S'] = 7,77,777,7777

d['T'],d['U'],d['V'],d[' '] = 8,88,888,0

d['W'],d['X'],d['Y'],d['Z'] = 9,99,999,9999

for _ in range(int(input())):
    
    s = input()
    
    ans = ""
    
    for i in s:
        
        ans += str(d[i])
        
    print(ans)
