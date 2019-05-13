/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,i,j,x=0;
		String s = "";
		while(t > 0){
		    n = sc.nextInt();
		    s = sc.next();
		    x = s.length();
		    int dp[][] = new int[x+1][x+1];
		    char arr[] = new char[x];
		    arr = s.toCharArray();
		    for(i = 0; i <= x; i++){
		        dp[i][0] = 0;
		    }
		    for(i = 0; i <= x; i++){
		        dp[0][i] = 0;
		    }
		    for(i = 1; i <= x; i++){
		        for(j = 1; j <= x; j++){
		            if(arr[i-1] == arr[j-1] && (i-1) != (j-1)){
		                dp[i][j] = 1 + dp[i-1][j-1];
		            }else{
		                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
		            }
		        }
		    }
		    System.out.println(dp[x][x]);
		    t--;
		}
	}
}
