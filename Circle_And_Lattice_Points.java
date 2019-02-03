

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++){
		    int radius = sc.nextInt();
		    int ans = 4;
		    for(int j = 1; j < radius; j++){
		        for(int k = 1; k < radius; k++){
		            if((radius * radius) == (j * j) + (k * k)){
		                ans += 4;
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}
