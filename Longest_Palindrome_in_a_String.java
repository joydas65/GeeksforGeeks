/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for(int x=1;x<=t;x++){
    		String word = sc.next();
    		//System.out.println(word);
    		int final_ans = Integer.MIN_VALUE,prev = Integer.MIN_VALUE;
    		int ind=1,n=word.length();
    		int left,right,le=0,ri=0;
    		while(ind<n-1){
    		    int flag=0;
    		    left = ind-1;
    		    right = ind+1;
    		    while(left >= 0 && right < n && word.charAt(left) == word.charAt(right)){
    		        left -= 1;
    		        right += 1;
    		        flag=1;
    		    }
    		    if(flag == 1){
    		        left++;
    		        right--;
    		    }else{
    		        left = right = ind-1;
    		    }
    		    final_ans = Math.max(final_ans, right - left + 1);
    		    if(final_ans != prev){
    		        le = left;
    		        ri = right;
    		    }
    		    prev = final_ans;
    		    ind+=1;
    		}
    		ind=0;
    		while(ind<n-1){
    		    int flag=0;
    		    left=ind;
    		    right=ind+1;
    		    while(left >= 0 && right < n && word.charAt(left) == word.charAt(right)){
    		        left -= 1;
    		        right += 1;
    		        flag=1;
    		    }
    		    if(flag == 1){
    		        left++;
    		        right--;
    		    }else{
    		        left = right = ind;
    		    }
    		    final_ans = Math.max(final_ans, right - left + 1);
    		    if(final_ans != prev){
    		        le = left;
    		        ri = right;
    		    }
    		    ind+=1;
    		    prev = final_ans;
    		}
    		//System.out.println(final_ans);
    		String y = "";
    		for(int i=le; i <= ri; i++){
    		    y = y + word.charAt(i);
    		}
    		System.out.println(y);
		}
	}
}
