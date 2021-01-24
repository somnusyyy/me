#include <stdio.h>

unsigned long step=0; 
void hanoi(unsigned int num,char a,char b,char c)//表示将num数量的圆盘从a移动到b
{
    if(num==1) step++;
    else 
    {
        //利用数学归纳法将num个圆盘看为两个整体，其中前num-1个与第num个分别看为两个不同的整体
        hanoi(num-1,a,c,b);
        step++;//代表将第num个最大的圆盘从a移动到b上
        hanoi(num-1,c,b,a);
    }
}

int main()
{
    unsigned int num;
    scanf("%d",&num);
    hanoi(num,'A','B','C');
    printf("%ld",step);
}