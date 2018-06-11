#include <stdio.h>

int main(){
    unsigned long long int n = 0;
    scanf("%I64u", &n);
    if(n == 0){
        printf("0\n");
        return 0;
    }
    n += 1;
    if(n % 2 == 0){
        printf("%I64u\n", n/2);
    }else{
        printf("%I64u\n", n);
    }
    return 0;
}
