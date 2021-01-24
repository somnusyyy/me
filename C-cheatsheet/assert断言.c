#include <stdio.h>
#include <assert.h>

int main()
{
    int num;
    scanf("%d", &num);
    assert(num > 0);
    /* assert(int expression)
        当expression为真时，直接略过该语句，为假时，中断程序（Abort trap: 6）

        与if(num<=0) exit(-1)类似
        但断言便于在调试程序时发现错误，不会影响程序执行效率（只在debug版本起作用，release版本则跳过该语句） 
        故断言只用于程序调试而不作为程序的功能， 


        适合断言的情况：
        1.检查程序中各种假设的正确性（例如检查程序中的计算结果是否在合理的范围内）
        2.证实某种不可能发生的事确实不可能发生
        
        基本原则：
        可以通过断言来捕获不可能发生的事情发生的情况（注意与非法情况区别）
        每个assert只检验一个条件
        
    */
}