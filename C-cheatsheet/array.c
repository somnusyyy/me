#include <stdio.h>
#include <string.h>

int main()
{
    int a[10],b[10];
    memset(a, 0, sizeof(a));//初始化函数
    memcpy(b,a,sizeof(a));//将数组a赋值给b
}