/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args){
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,i,j;
		while(t > 0){
		    n = sc.nextInt();
		    int sum = 0;
		    int arr[] = new int[n];
		    for(i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		    boolean dp[][] = new boolean[n+1][sum+1];
		    for(i=0;i<=n;i++){
		        dp[i][0] = true;
		    }
		    for(i=1;i<=sum;i++){
		        dp[0][i] = false;
		    }
		    for(i=1;i<=n;i++){
		        for(j=1;j<=sum;j++){
		            dp[i][j] = dp[i-1][j];
		            if(j >= arr[i-1]){
		                dp[i][j] = dp[i][j] || dp[i-1][j-arr[i-1]];
		            }
		        }
		    }
		    int diff=0;
		    for(i = sum/2; i >= 0; i--){
		        if(dp[n][i] == true){
		            diff = sum - 2*i;
		            break;
		        }
		    }
		    System.out.println(diff);
		    t--;
		}
	}
}
