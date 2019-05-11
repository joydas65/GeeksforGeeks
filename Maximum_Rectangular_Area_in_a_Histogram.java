/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i,j;
		for(i=0;i<t;i++){
		    int n = sc.nextInt();
		    long hist[] = new long[n];
		    for(j=0;j<n;j++){
		        hist[j] = sc.nextLong();
		    }
		    j = 0;
		    long area=0,ans=0;
		    int curMax=0;
		    Stack<Integer> st = new Stack<Integer>();
		    while(j < n){
		        if(st.empty() || hist[st.peek()] <= hist[j]){
		            st.push(j);
		            j++;
		        }else{
		            curMax = st.peek();
		            st.pop();
		            area = hist[curMax]*(st.empty()?j:(j-st.peek()-1));
		            ans = Math.max(ans, area);
		        }
		    }
		    while(!st.empty()){
		        curMax = st.peek();
		        st.pop();
		        area = hist[curMax]*(st.empty()?j:(j-st.peek()-1));
		        ans = Math.max(ans, area);
		    }
		    System.out.println(ans);
		}
	}
}
