#include<stdio.h>
#include<malloc.h>
int main(){
	//code
	int t,i,j,m,n,x;
	long *P,*Q;
	scanf("%d",&t);
	for(x = 1; x <= t; x++){
	    scanf("%d %d",&m,&n);
	    P = (long *)malloc(m*sizeof(long));
	    Q = (long *)malloc(n*sizeof(long));
	    for(i=0;i<m;i++){
	        scanf("%ld",&P[i]);
	    }
	    for(i=0;i<n;i++){
	        scanf("%ld",&Q[i]);
	    }
	    i=0;j=0;
	    while(i<m && j<n){
	        if(P[i] > Q[j]){
	            printf("%ld ",Q[j]);
	            j += 1;
	        }else if(P[i] < Q[j]){
	            printf("%ld ",P[i]);
	            i += 1;
	        }else{
	            printf("%ld %ld ",P[i],Q[j]);
	            i += 1;
	            j += 1;
	        }
	    }
	    if(i == m){
	        while(j < n){
	            printf("%ld ",Q[j]);
	            j += 1;
	        }
	    }else if(j == n){
	        while(i < m){
	            printf("%ld ",P[i]);
	            i += 1;
	        }
	    }
	    printf("\n");
	}
	return 0;
}
