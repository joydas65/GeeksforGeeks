import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int lb = Integer.MAX_VALUE, ub = -1;
    public static boolean check(int x, int n){
        return x >= 0 && x < n ? true : false;
    }
    public static void find(int lo, int hi, int arr[], int x, int n){
        //System.out.println(lb+" "+ub);
        if(lo > hi)
        return;
        
        if(check(lb-1, n) && arr[lb-1] < x && check(ub+1, n) && arr[ub+1] > x)
        return;
        
        int mid;
        
        mid = (lo + hi)/2;
            
        if(arr[mid] == x){
            lb = Math.min(lb, mid);
            ub = Math.max(ub, mid);
            //System.out.println(lb+" "+ub);
            find(lo, mid - 1, arr, x, n);
            find(mid + 1, hi, arr, x, n);
        }else if(arr[mid] > x){
            //System.out.println("Going to left");
            find(lo, mid - 1, arr, x, n);
        }else{
            //System.out.println("Going to right");
            find(mid + 1, hi, arr, x, n);
        }
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int n,x,i;
		
		while(t-- > 0){
		    n = sc.nextInt();
		    x = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    lb = Integer.MAX_VALUE; ub = -1;
		    
		    find(0, n-1, arr, x, n);
		    
		    if(lb >= 0 && lb < n && ub >= 0 && ub < n)
		    System.out.println(lb+" "+ub);
		    else
		    System.out.println(-1);
		}
	}
}
