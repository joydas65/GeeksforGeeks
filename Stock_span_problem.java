/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i,j,c;
		for(int x=1; x <= t; x++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int answer_array[] = new int[n];
		    answer_array[0] = 1;
		    for(i = 1; i < n; i++){
		        c = 0;
		        j = 0;
		        while(j <= i){
		            c = 0;
		            while(j <= i && arr[j] <= arr[i]){
		                c += 1;
		                j += 1;
		            }
		            j += 1;
		        }
		        answer_array[i] = c;
		    }
		    for(i=0;i<n;i++){
		        System.out.print(answer_array[i]+" ");
		    }
		    System.out.println();
		}
	}
}
