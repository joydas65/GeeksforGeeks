using System;
using System.Collections;
using System.Collections.Generic;
public class GFG{
	static public void Main () {
		//Console.WriteLine("Hello World!");
		int t = Convert.ToInt32(Console.ReadLine());
		while(t-- > 0){
		    int n = Convert.ToInt32(Console.ReadLine());
		    string line = Console.ReadLine();
		    string[] nums = line.Split(' ');
		    Hashtable dic = new Hashtable();
		    int flag = 0;
		    foreach(string i in nums){
		        if(dic.Contains(i)){
		            dic[i] = (int)(dic[i])+1;
		        }else{
		            dic.Add(i, 1);
		        }
		    }
		    int v = 1;
		    foreach(string i in nums){
		        if((int)dic[i] > 1){
		            Console.WriteLine(v);
		            flag = 1;
		            break;
		        }
		        v += 1;
		    }
		    if(flag == 0)
		    Console.WriteLine("-1");
		}
	}
}
