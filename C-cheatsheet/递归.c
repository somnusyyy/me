#include <stdio.h>

unsigned long fact(unsigned int x)
{
    if (x == 1 || x == 0) //基本条件，即退出边界
        return 1;
    else //一般条件
        return x * fact(x - 1);
}

unsigned long fact2(unsigned int x, unsigned long ans)
/*
    尾递归 降低递归调用对栈的需求（回归时不需要做任何操作）
*/
{
    if (x == 1)
        return ans;
    else
        return fact2(x - 1, ans * x);
}

int main()
{
    int m, n;
    scanf("%d%d", &m, &n); //C(n m)
    long ans = fact(m) / (fact(n) * fact(m - n));
    printf("%ld\n", fact2(m, 1));
    // printf("%ld",fact(m));
    printf("%ld\n", ans);
}