#include<iostream>
using namespace std;
int main(){
	int t=0;
	cin>>t;
	while(t>0){
  
	    int n=0;
	    cin>>n;
      
	    int arr[n+1][n+1];
	    arr[0][0]=1;
      
	    for(int i = 1; i <= n; i++){
	        arr[i][0] = arr[i-1][i-1]%1000000007;
          
	        for(int j = 1; j<=i; j++){
	            arr[i][j] = ((arr[i][j-1]%1000000007)+(arr[i-1][j-1]%1000000007))%1000000007;
	        }
	    }
	    cout<<arr[n][0]<<endl;
	    t--;
	}
	return 0;
}
