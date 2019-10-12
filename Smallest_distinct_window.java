/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int n = 0;
		
		while(t-- > 0){
		    String s = sc.next();
		    HashSet<Character> sf = new HashSet<Character>();
		    StringBuilder sb = new StringBuilder("");
		    for(int i = 0; i < s.length(); i++){
		        char c = s.charAt(i);
		        if(!sf.contains(c)){
		            sf.add(c);
		            sb.append(c);
		        }
		        
		    }
		    
		    String pat = sb.toString();
		    //System.out.println(pat);
		    n = pat.length();
		    int s_arr[] = new int[256];
		    
		    Arrays.fill(s_arr, 0);
		    
		    int pat_arr[] = new int[256];
		    
		    Arrays.fill(pat_arr, 0);
		    
		    for(int i = 0; i < n; i++){
		        char c = pat.charAt(i);
		        pat_arr[(int)c] += 1;
		    }
		    
		    int count=0,start=0,start_index=-1,min_len=Integer.MAX_VALUE;
		    
		    for(int i = 0; i < s.length(); i++){
		        char c = s.charAt(i);
		        s_arr[(int)c] += 1;
		        
		        if(pat_arr[(int)c] != 0 && s_arr[(int)c] <= pat_arr[(int)c]){
		            count++;
		        }
		        
		        if(count == n){
		            while(s_arr[s.charAt(start)] > pat_arr[s.charAt(start)] || pat_arr[s.charAt(start)] == 0){
		                if(s_arr[s.charAt(start)] > pat_arr[s.charAt(start)]){
		                    s_arr[s.charAt(start)] -= 1;
		                }
		                start++;
		            }
		            int len_window = i - start + 1;
		            
		            if(min_len > len_window){
		                min_len = len_window;
		                start_index = start;
		            }
		        }
		    }
		    System.out.println(min_len);
		    //System.out.println(s);
		}
	}
}
