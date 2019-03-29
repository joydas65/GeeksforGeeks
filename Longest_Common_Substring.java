/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int ans = 0;
		
		for(int i = 0; i < t; i++){
		    ans = 0;
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    String x = sc.next();
		    String y = sc.next();
		    String temp = "";
		    for(int j = 0; j < n; j++){
		        for(int k = j; k < n; k++){
		            temp = temp + x.charAt(k);
		            int c = temp.length();
		            if((m-c)==0){
		                if(temp.equals(y)){
		                    ans = Math.max(ans, c);
		                }
		            }else{
    		            for(int l = 0; l < m-c; l++){
    		                String v = y.substring(l, l+c);
    		                if(v.equals(temp)){
    		                   
    		                    ans = Math.max(ans, c);
    		                    //System.out.println(ans);
    		                    break;
    		                }
    		            }
		            }
		        }
		        temp = "";
		    }
		    System.out.println(ans);
		}
	}
}
