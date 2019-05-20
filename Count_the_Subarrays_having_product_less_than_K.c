#include<stdio.h>
#include<malloc.h>
int main(){
	//code
	int t,i,ind = 0,lastIndex = 0;
	long n,val=0;
	long long k,prod = 1,mul = 1,ans=0,subt=0,dist;
	scanf("%d",&t);
	while(t>0){
	    ans = 0;prod=1;ind=0;lastIndex=0;subt=0;
	    scanf("%ld %lld",&n,&k);
	    long *arr;
	    arr = (long *)malloc(n*sizeof(long));
	    for(i=0;i<n;i++){
	        scanf("%ld",&arr[i]);
	    }
	    while(ind < n){
	        prod = prod * arr[ind];
	        if(prod >= k){
	            val = ind - lastIndex;
	            ans += (val*(val+1))/2;
	            mul = 1;
	            for(i=ind; i>=0; i--){
	                mul = mul * arr[i];
	                if(mul >= k){
	                    break;
	                }
	            }
	            lastIndex = i+1;
	            if(lastIndex < ind){
	                dist = ind - lastIndex;
	                subt += (dist*(dist+1))/2;
	            }
	            prod = 1;
	            ind = lastIndex;
	        }else{
	            ind++;
	        }
	    }
	    val = ind - lastIndex;
	    ans += (val*(val+1))/2;
	    ans -= subt;
	    printf("%lld\n",ans);
	    t--;
	}
	return 0;
}
