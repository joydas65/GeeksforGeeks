import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int k,n,i,j,best,p;
		
		while(t-- > 0){
		    k = sc.nextInt();
		    
		    n = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int dp[][] = new int[k+1][n+1];
		    
		    int pre[] = new int[n+1];
		    
		    for(i = 1; i <= n; i++){
		        pre[i] = pre[i-1] + arr[i-1];
		    }
		    
		    for(i = 1; i <= n; i++){
		        dp[1][i] = pre[i];
		    }
		    
		    for(i = 1; i <= k; i++){
		        dp[i][1] = arr[0];
		    }
		    
		    for(i = 2; i <= k; i++){
		        for(j = 2; j <= n; j++){
		            best = Integer.MAX_VALUE;
		            
		            for(p = 1; p <= j; p++){
		                best = Math.min(best, Math.max(dp[i-1][p], pre[j] - pre[p]));
		            }
		            
		            dp[i][j] = best;
		        }
		    }
		    
		    System.out.println(dp[k][n]);
		}
	}
}
