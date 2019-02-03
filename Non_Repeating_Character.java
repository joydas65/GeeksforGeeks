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
		    String word = sc.next();
		    Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
		    for(int j = 0; j < word.length(); j++){
		        char c = word.charAt(j);
		        if(dictionary.containsKey(c)){
		            Integer val = dictionary.get(c);
		            dictionary.put(c, val + 1);
		        }else{
		            dictionary.put(c,1);
		        }
		    }
		    int flag = 0;
		    for(int j = 0; j < word.length(); j++){
		        char c = word.charAt(j);
		        if(dictionary.get(c) == 1){
		            System.out.println(c);
		            flag = 1;
		            break;
		        }
		    }
		    if(flag == 0){
		        System.out.println("-1");
		    }
		    flag = 0;
		}
	}
}
