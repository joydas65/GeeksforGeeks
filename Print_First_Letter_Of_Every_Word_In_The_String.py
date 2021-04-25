class Solution:
	def firstAlphabet(self, S):
		# code here
		ans = S[0]
		
		n = len(S)
		
		for i in range(1,n):
		    
		    if S[i] == " ":
		        
		        ans += S[i+1]
		        
		return ans
