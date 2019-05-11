#include<stdio.h>
#include<malloc.h>
int main() {
	//code
	int t,i,x,temp;
	long n,hi,mid,lo;
	int *arr;
	scanf("%d",&t);
	for(x=1;x<=t;x++){
	    scanf("%ld",&n);
	    arr = (int *)malloc(n*sizeof(int));
	    for(i=0;i<n;i++){
	        scanf("%d",&arr[i]);
	    }
	    lo=mid=0;
	    hi=n-1;
	    while(mid <= hi){
	        if(arr[mid] == 0){
	            temp = arr[lo];
	            arr[lo] = arr[mid];
	            arr[mid] = temp;
	            lo++;
	            mid++;
	        }else if(arr[mid] == 1){
	            mid++;
	        }else{
	            temp = arr[mid];
	            arr[mid] = arr[hi];
	            arr[hi] = temp;
	            hi--;
	        }
	    }
	    for(i=0;i<n;i++){
	        printf("%d ",arr[i]);
	    }
	    printf("\n");
	}
	return 0;
}
