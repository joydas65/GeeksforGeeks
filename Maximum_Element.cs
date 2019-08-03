using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
class Solution {
    public Stack<int> s = new Stack<int>(); 
        public int maxEle;
        public void getMax()  
        {  
            if (s.Count == 0)  
                Console.Write("Stack is empty\n");  
    
            // variable maxEle stores the maximum element  
            // in the stack.  
            else
                Console.WriteLine(maxEle);  
        }

        public void push(int x)  
        {  
            // Insert new number into the stack  
            if (s.Count == 0)  
            {  
                maxEle = x;  
                s.Push(x);  
                //Console.Write("Number Inserted: " + x + "\n");  
                return;  
            }  
    
            // If new number is less than maxEle  
            if (x > maxEle)  
            {  
                s.Push(2 * x - maxEle);  
                maxEle = x;  
            }  
    
            else
                s.Push(x);  
    
            //Console.Write("Number Inserted: " + x + "\n");  
        }  


        public void pop()  
        {  
            if (s.Count == 0)  
            {  
                Console.Write("Stack is empty\n");  
                return;  
            }  
    
            //Console.Write("Top Most Element Removed: ");  
            int t = s.Peek();  
            s.Pop();  
    
            // Maximum will change as the maximum element  
            // of the stack is being removed.  
            if (t > maxEle)  
            {  
                //Console.Write(maxEle + "\n");  
                maxEle = 2 * maxEle - t;  
            }   
        }
        static void Main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
            int n = Convert.ToInt32(Console.ReadLine());
            //Stack nums = new Stack();
            Solution sln = new Solution();
            for(int i = 0; i < n; i++){
                string line = Console.ReadLine();
                if(line.Length == 1){
                    if(line == "2"){
                        sln.pop();
                    }else{
                        sln.getMax();
                    }
                }else{
                    string[] tokens = line.Split(' ');
                    sln.push(Convert.ToInt32(tokens[1]));
                    //int[] numbers = Array.ConvertAll(tokens, int.Parse)
                }
            }
        }

}

