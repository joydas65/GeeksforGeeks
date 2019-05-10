/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int flag=0;
		for(int x=1;x<=t;x++){
		    int n = sc.nextInt();
		    int nums[] = new int[n];
		    for(int i=1;i<=n;i++){
		        nums[i-1] = sc.nextInt();
		    }
		    for(int i=1;i<=n;i++){
		        nums[i-1] = nums[i-1]*nums[i-1];
		    }
		    Arrays.sort(nums);
		    for(int i=n-1; i>=2; i--){
		        int lo=0;
		        int hi=i-1;
		        flag=0;
		        while(lo < hi){
		            if(nums[lo]+nums[hi]==nums[i]){
		                flag=1;
		                break;
		            }else if(nums[lo]+nums[hi] < nums[i]){
		                lo++;
		            }else if(nums[lo]+nums[hi] > nums[i]){
		                hi--;
		            }
		        }
		        if(flag == 1)
		        break;
		    }
		    if(flag == 1){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
