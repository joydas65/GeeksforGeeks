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
		while(t > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int sum=0;
		    for(i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		    if(sum % 2 == 1){
		        System.out.println("NO");
		    }else{
		        sum = sum/2;
		        boolean dp[][] = new boolean[sum+1][n+1]; 
		        for(i = 1; i <= sum; i++){
		            dp[i][0] = false;
		        }
		        for(i = 0; i <= n; i++){
		            dp[0][i] = true;
		        }
		        for(i=1;i<=sum;i++){
		            for(j=1;j<=n;j++){
		                dp[i][j] = dp[i][j-1];
		                if(i >= arr[j-1]){
		                    dp[i][j] = dp[i][j] || dp[i-arr[j-1]][j-1];
		                }
		            }
		        }
		        if(dp[sum][n] == true){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		    t--;
		}
	}
}
