#include <stdio.h>
#include <stdlib.h>
#include <math.h>

long fact(int num){
    long  returnnum=num;
    if(num<0){
        return printf("Input error\n");
    }
    return returnnum;
}

int main(){
    int x; 
    scanf("%d",&x);
    printf("%ld\n",fact(x));
}

