#Here is the question

'''

You are given a string S and a Pattern P. You need to find all matches of hash of P in string S. Also, print the index (0 based) at which the pattern's hash is found. If no match is found, print -1.

Note: All the matches should have same length as pattern P.

The hash of pattern P is calculated by summing the values of characters as they appear in the alphabets table. For reference, a is 1, b is 2, ...z is 26. Now, using the mentioned values, hash of ab is 1+2=3.

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains the string S. The second line contains the pattern P.

Output:
For each testcase, in a new line, print the matches and index separated by a space. All the matches should be printed in their own separate lines.

Constraints:
1 <= T <= 100
1 <= |S|, |P| <= 105

Examples:
Input:
1
bacdaabaa
aab
Output:
aab 4
aba 5
baa 6

Explanation:
Testcase1: P is aab, and S is bacdaabaa
Now, the hash of P: aab is 1+1+2=4
In the string S, the hash value of 4 is obtained by the following:
aab=1+1+2=4, at index 4
aba=1+2+1=4, at index 5
baa=2+1+1=4, at index 6

'''


for _ in range(int(input())):
    
    s = input()
    
    p = input()
    
    slen,plen = len(s),len(p)
    
    if plen > slen:
        
        print("-1")
        
    else:
        
        d,ans = dict(),[]
    
        for i in "abcdefghijklmnopqrstuvwxyz":
            
            d[i] = ord(i)-96
            
        val,x = 0,0
        
        for i in p:
            
            x += d[i]
        
        for i in range(plen):
            
            val += d[s[i]]
            
        if val == x:
            
            ans.append(0)
            
        i = 1
        
        while i <= slen-plen:
            
            val -= d[s[i-1]]
            
            val += d[s[i + plen - 1]]
            
            if val == x:
                
                ans.append(i)
                
            i += 1
            
        if ans == []:
            
            print("-1")
            
        else:
            
            for i in ans:
                
                for j in range(i,i+plen):
                    
                    print(s[j],end="")
                    
                print(" {one}".format(one = i))
                
        
            
        
            
            
        
        
