for _ in range(int(input())):
    num = int(input())

    arr = list(map(int, input().split()))

    n = int(input())

    p = 1

    l = []

    f = []

    t = 0

    h = []

    for i in range(1,int(n/2 + 1)):
        f.append(i)
        f.append(n-i)
        l.append(tuple(f))
        f = []
    f = []
    while p <= n:
        for i in range(0,len(l)):
            if len(l[i]) > p:
                t = l[i][p]
                for j in range(1,int(t/2 + 1)):
                    for k in range(0,len(l[i])-1):
                        f.append(l[i][k])
                    f.append(j)
                    f.append(t-j)
                    f = sorted(f)
                    h.append(tuple(f))
                    f = []
        h = list(set(h))
        for i in range(0,len(h)):
            l.append(h[i])
        h = []
        p += 1
    t = 0
    ans_arr = []
    for i in l:
        for j in i:
            if j in arr:
                h.append(j)
                arr.remove(j)
                t += 1
        if t == len(i):
            #print(i)
            ans_arr.append(i)
        t = 0
        for j in h:
            arr.append(j)
        h = []

    if n not in arr and ans_arr == []:

        print("Empty")
    else:

        for i in sorted(ans_arr):
            
            x = "("

            for j in range(len(i)):
                
                if j == len(i) - 1:
                    
                    x += str(i[j]) + ")"
                    
                else:
                
                    x += str(i[j]) + " "
                
            print(x,end = "")
            
        if n in arr:
            
            print("({one})".format(one = n))
            
        else:
            
            print()


