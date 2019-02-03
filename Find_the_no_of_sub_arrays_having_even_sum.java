/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    String x = sc.next();
		    String input = sc.nextLine();
		    String[] items = input.split(" ");
		    int[] inputArray = new int[n];
		    for(int j = 0; j < n; j++){
		        if(j == 0)
		        inputArray[j] = Integer.parseInt(x);
		        else
		        inputArray[j] = Integer.parseInt(items[j]);
		    }
		    ArrayList<Integer> sums = new ArrayList<Integer>();
		    int sum = 0;
		    for(int j = 0; j < n; j++){
		        sums.add(inputArray[j]);
		        sum += inputArray[j];
		        for(int k = j + 1; k < n; k++){
		            sums.add(sum + inputArray[k]);
		            sum += inputArray[k];
		        }
		        sum = 0;
		    }
		    int ans = 0;
		    Integer[] sumArray = sums.toArray(new Integer[sums.size()]);
		    for(int j = 0; j < sumArray.length; j++){
		        if(sumArray[j] % 2 == 0){
		            ans += 1;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
