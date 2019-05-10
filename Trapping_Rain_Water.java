/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=1;x<=t;x++){
		    int n = sc.nextInt();
		    int bars[] = new int[n];
		    for(int i=0;i<n;i++){
		        bars[i] = sc.nextInt();
		    }
		    int left[] = new int[n];
		    int right[] = new int[n];
		    left[0] = bars[0];
		    for(int i=1;i<n;i++){
		        left[i] = Math.max(left[i-1], bars[i]);
		    }
		    right[n-1]=bars[n-1];
		    for(int i=n-2;i>=0;i--){
		        right[i] = Math.max(right[i+1], bars[i]);
		    }
		    int water = 0;
		    for(int i=0;i<n;i++){
		        water += Math.min(left[i],right[i])-bars[i];
		    }
		    System.out.println(water);
		}
	}
}
