from collections import defaultdict

class Solution:
	def canPair(self, nums, k):
		# Code here
		
		d = defaultdict(lambda: 0)
		
		for i in range(n):
		    
		    d[((nums[i] % k) + k) % k] += 1
		        
	    for i in range(n):
	        
	        rem = ((nums[i] % k) + k) % k
	        
	        if 2*rem == k:
	            
	            if d[rem] % 2 != 0:
	                
	                return False
	                
	        elif rem == 0:
	            
	            if (d[rem] & 1):
	                
	                return False
	                
	        else:
	            
	            if d[rem] != d[k - rem]:
	                
	                return False
	            
	    return True
