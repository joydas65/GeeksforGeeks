#include<iostream>
#include<malloc.h>
#include<bits/stdc++.h>
using namespace std;

bool check(int arr[], int n, int m, long curr_min) 
{ 
    int studentsRequired = 1; 
    long curr_sum = 0; 
 
    for (int i = 0; i < n; i++) 
    { 
        if (arr[i] > curr_min) 
            return false; 

        if (curr_sum + arr[i] > curr_min) 
        { 
            studentsRequired++; 
            
            curr_sum = arr[i]; 
            
            if (studentsRequired > m) 
                return false; 
        } 
        else
            curr_sum += arr[i]; 
    } 
    return true; 
} 

long computePages(int arr[], int n, int m) 
{ 
    long long sum = 0; 
    if (n < m) 
        return -1; 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 

    long start = 0, end = sum; 
    long result = INT_MAX; 
    while (start <= end) 
    { 
        long mid = (start + end) / 2; 
        if(check(arr, n, m, mid)) 
        { 
            result = min(result, mid); 
            end = mid - 1; 
        } 
        else
            start = mid + 1; 
    } 
    return result; 
} 

int main(){
	//code
	int t;
	cin>>t;
	for(int x = 1; x <= t; x++){
	    int n;
	    cin>>n;
	    int *arr;
	    arr = (int *)malloc(n*sizeof(int));
	    for(int i = 0; i < n;i++){
	        cin>>arr[i];
	    }
	    int m;
	    cin>>m;
	    cout<<computePages(arr, n, m)<<endl;
	}
	return 0;
}
