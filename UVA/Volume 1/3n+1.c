#include <stdio.h>

int algo(int lower, int upper){
    int ctr=1, max=0, i;

    for(i=lower; i<=upper; i++){
        int n=i;
        printf("%d ", n);
        while(n!=1){
            printf("%d ", n);
            if(n%2==1)
                n = 3*n + 1;
            else
                n = n/2;
            ctr++;
        }
        printf("\n");
        if(max<ctr)
            max = ctr;
        ctr=1;
    }

    return max;
}
int main(){
    int n, m;
    scanf("%d%d", &n, &m);
    printf("%d %d %d", n,m,algo(n, m));

}