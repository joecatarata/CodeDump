#include <iostream>
#include <stdio.h>
typedef unsigned long long ull;
void swap(ull *x, ull *y){
	int temp = *x;
	*x = *y;
	*y = temp;
}
ull fib(ull x, ull memo[]){
	if(x <= 0){
		return 0;
	}else if(x == 1){
		return 1;
	}else if(memo[x]){
		memo[x] = fib(x-1, memo) + fib(x-2, memo);
	}
	return memo[x];
}
int main(){
	
	ull memo[5000];
	ull fibnum;
	for(int i=0; i<5000; i++){
		memo[i] = 1;
	}
	while((scanf("%llu", &fibnum)) == 1){
			ull x = 1;
			ull y = 1;
			if(fibnum == 0){
				printf("0");
			}else if(fibnum == 1){
				printf("1");
			}else{
					for(int i=2; i<=fibnum; i++){
					x += y;
					swap(&x, &y);
					
				}
//				x = fib(fibnum, memo);
			}
		printf("The Fibonacci number for %llu is %llu\n", fibnum, x);
	}
	return 0;
	
}
