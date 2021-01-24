#include <stdio.h>

long max(long x,long y){   //x和y为形参，并不知道实际的数值只做为入口
    return x>y?x:y;
}

int main(){
    long a=9,b=6;
    printf("%ld\n",max(a,b));//a和b是实参实际知道的函数
}