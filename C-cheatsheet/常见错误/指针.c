#include <stdio.h>

//1
void swap(int *x,int *y)
//该程序只改变了x和y指向的地址的值，并没有真正实现两数交换
//如x=&a y=&b只改变成了x=&b y=&a
{ 
    int *ptemp;
    
    ptemp=x;
    x=y;
    y=ptemp;
}

//2
void swap2(int *x,int *y)
{
    int *ptemp;//未初始化

    *ptemp=*x;
    *x=*y;
    *y=*ptemp;
}

//True
void swap_true(int *x,int *y)
{
    int ptemp;

    ptemp=*x;
    *x=*y;
    *y=ptemp;
}

int main()
{
    int a=3,b=4;
    swap_true(&a,&b);
    printf("%d %d\n",a,b);
}