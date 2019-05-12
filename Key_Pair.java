
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x,n,X,i;
		for(x = 1; x <= t; x++){
		    n = sc.nextInt();
		    X = sc.nextInt();
		    int arr[] = new int[n];
		    for(i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    HashSet<Integer> hash = new HashSet<Integer>();
		    for(i = 0; i < n; i++){
		        if(hash.contains(X - arr[i])){
		            System.out.println("Yes");
		            break;
		        }else{
		            hash.add(arr[i]);
		        }
		    }
		    if(i == n){
		        System.out.println("No");
		    }
		}
	}
}
