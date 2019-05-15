/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i;
		long mod = 1000000007;
		while(t > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    long total[] = new long[n];
		    long same[] = new long[n];
		    long diff[] = new long[n];
		    same[0] = 0;
		    diff[0] = k;
		    total[0] = k;
		    same[1] = k;
		    diff[1] = k*(k-1);
		    total[1] = k+(k*(k-1));
		    for(i=2;i<n;i++){
		        same[i] = diff[i-1]%mod;
		        diff[i] = (((diff[i-1]%mod)+(diff[i-2]%mod)%mod)*((k-1)%mod))%mod;
		        total[i] = ((same[i]%mod)+(diff[i]%mod))%mod;
		    }
		    System.out.println(total[n-1]%mod);
		    t--;
		}
	}
}
