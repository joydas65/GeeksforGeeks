/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args){
	    long mod = 1000000007;
	    long dp[] = new long[100001];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		int i;
		for(i=3;i<=100000;i++){
		    dp[i] = ((dp[i-1]%mod)+(dp[i-2]%mod))%mod;
		}
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    System.out.println(dp[n]);
		    t--;
		}
	}
}
