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
		    String nums[] = sc.nextLine().split(" ");
		    ArrayList<String> arr = new ArrayList<String>();
		    for(int j = 0; j < n; j++){
		        if(j == 0)
		        arr.add(x);
		        else
		        arr.add(nums[j]);
		    }
		    Collections.sort(arr, new Comparator<String>(){
		        public int compare(String X, String Y){
		            String XY = X + Y;
		            String YX = Y + X;
		            return XY.compareTo(YX) > 0 ? -1:1;
		        }
		    });
		    Iterator it = arr.iterator();
		    while(it.hasNext()){
		        System.out.print(it.next());
		    }
		    System.out.println();
		}
	}
}
