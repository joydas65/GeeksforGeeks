/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[]args){
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i,j,n;
		while(t > 0){
    		n = sc.nextInt();
    		int arr[] = new int[n];
    		for(i=0;i<n;i++){
    		    arr[i] = sc.nextInt();
    		}
    		int lis[] = new int[n];
    		for(i=0;i<n;i++){
    		    lis[i] = 1;
    		}
    		for(i=1;i<n;i++){
    		    for(j=0;j<i;j++){
    		        if(arr[i] > arr[j] && lis[i] < lis[j]+1){
    		            lis[i] = lis[j]+1;
    		        }
    		    }
    		}
    		int lds[] = new int[n];
    		for(i=0;i<n;i++){
    		    lds[i] = 1;
    		}
    		for(i=n-2;i>=0;i--){
    		    for(j=n-1;j>i;j--){
    		        if(arr[i] > arr[j] && lds[i] < lds[j] + 1){
    		            lds[i] = lds[j] + 1;
    		        }
    		    }
    		}
    		int ma = lis[0]+lds[0]-1;
    		for(i=1;i<n;i++){
    		    if(ma < lis[i]+lds[i]-1){
    		        ma = lis[i]+lds[i]-1;
    		    }
    		}
    		System.out.println(ma);
    		t--;
		}
	}
}
