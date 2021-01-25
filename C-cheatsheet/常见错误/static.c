#include <stdio.h>

unsigned long func(int p)
{
    static unsigned long num=1;
    //num仅在编译的时候初始化一次，之后使用的num皆为上一次调用num的返回值
    num=num*p;
    return num;
}

int main()
{
    for(int i=1;i<=10;i++)
    {
        printf("%ld\n",func(i));
    }
}