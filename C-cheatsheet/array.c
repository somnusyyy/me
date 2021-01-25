#include <stdio.h>
#include <string.h>

/*
memset(a, 0, sizeof(a));//初始化函数
memcpy(b,a,sizeof(a));//将数组a赋值给b
*/

double average(int score[], int data_length)
{
    int ans = 0;
    for (int i = 0; i < data_length; i++)
    {
        ans += score[i];
    }
    return (double)ans / data_length;
}

int main()
{
    int score[10];
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &score[i]);
    }
    double ave = average(score, sizeof(score) / 4); //注意调用数组时用不带下表的数组名作为实参，用来代表首地址

    printf("%f", ave);
}