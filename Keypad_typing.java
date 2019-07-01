/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args){
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String s = sc.next();
		    StringBuilder sb = new StringBuilder();
		    for(int i = 0; i < s.length(); i++){
		        char c = s.charAt(i);
		        int v = (int)c - 97;
		        if(v >= 0 && v <= 2)
		        sb.append(2);
		        else if(v >= 3 && v <= 5)
		        sb.append(3);
		        else if(v >= 6 && v <= 8)
		        sb.append(4);
		        else if(v >= 9 && v <= 11)
		        sb.append(5);
		        else if(v >= 12 && v <= 14)
		        sb.append(6);
		        else if(v >= 15 && v <= 18)
		        sb.append(7);
		        else if(v >= 19 && v <= 21)
		        sb.append(8);
		        else
		        sb.append(9);
		    }
		    System.out.println(sb.toString());
		}
	}
}
