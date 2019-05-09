/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=1;x<=t;x++){
		    String word = sc.next();
		    int n = word.length();
		    int l[][] = new int[n][n];
		    for(int i = 0; i < n; i++){
		        l[i][i] = 1;
		    }
		    int j=0;
		    for(int c1=2;c1<=n;c1++){
		        for(int i = 0; i < n-c1+1; i++){
		            j = i+c1-1;
		            if(word.charAt(i) == word.charAt(j) && c1 == 2){
		                l[i][j] = 2;
		            }else if(word.charAt(i) == word.charAt(j)){
		                l[i][j] = l[i+1][j-1]+2;
		            }else{
		                l[i][j] = Math.max(l[i+1][j], l[i][j-1]);
		            }
		        }
		    }
		    System.out.println(l[0][n-1]);
		}
	}
}
