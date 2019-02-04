import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    String input = sc.next();
		    int top_of_the_stack = -1;
		    int flag = 0;
		    char[] stack = new char[100];
		    for(int j = 0; j < input.length(); j++){
		        char c = input.charAt(j);
		        if(c == '{' || c == '[' || c == '('){
		            top_of_the_stack += 1;
		            stack[top_of_the_stack] = c;
		        }else{
		            if(top_of_the_stack >= 0 && stack[top_of_the_stack] == '{' && c == '}'){
		                top_of_the_stack--;
		            }else if(top_of_the_stack >= 0 && stack[top_of_the_stack] == '(' && c == ')'){
		                top_of_the_stack--;
		            }else if(top_of_the_stack >= 0 && stack[top_of_the_stack] == '[' && c == ']'){
		                top_of_the_stack--;
		            }else{
		                flag = 1;
		                break;
		            }
		        }
		    }
		    if(flag == 1)
		    System.out.println("not balanced");
		    else{
		        if(top_of_the_stack >= 0)
		        System.out.println("not balanced");
		        else
		        System.out.println("balanced");
		    }
		}
	}
}
