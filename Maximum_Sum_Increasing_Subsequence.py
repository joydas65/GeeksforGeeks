#include <stdio.h>
#include<malloc.h>
long compute(long arr[], long n){
    long *dpArr;
    long i,j,ans=0;
    dpArr = (long *)malloc(n * sizeof(long));
    for(i=0;i<n;i++)
    dpArr[i]=arr[i];
    for(i=1;i<n;i++){
        for(j=0;j<i;j++){
            if(arr[i]>arr[j]&&dpArr[i]<dpArr[j]+arr[i]){
                dpArr[i]=dpArr[j]+arr[i];
            }
        }
    }
    for(i=0;i<n;i++){
        if(ans < dpArr[i]){
            ans = dpArr[i];
        }
    }
    return ans;
}
int main() {
	//code
	long *arr;
	long n,j;
	int t,i;
	scanf("%d",&t);
	for(i=0;i<t;i++){
	    scanf("%ld",&n);
	    arr = (long *)malloc(n * sizeof(long));
	    for(j=0;j<n;j++){
	        scanf("%ld",&arr[j]);
	    }
	    printf("%ld\n",compute(arr, n));
	}
	return 0;
}
