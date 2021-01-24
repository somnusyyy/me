#include <stdio.h>

/*
常量：
1）整形 默认int
    67 022 0x21 123L（长整型） 123u（无符号整型）
2）实型 默认double
    3.14 1.2e-5 2.73F(单精度实型) 2.73L(双精度实型)
3）字符型 'z'
4）字符串 "z"
5）枚举型

*/

/*
常量
1)宏常量 用一个标识符来表示的常量
    #define 标识符 字符串
    ’#‘代表编译预处理命令 ：在编译前进行处理
    字符串不区分数据类型
    不是语句，不要加“；”，否则宏替换后会出现语法错误
    问题：
        没有数据类型，不进行语法检查
        只进行简单的字符串替换
        

2）const常量
    

*/
#define PI 3.1415926
const double pi=3.1415926; //默认double




int main(){


    printf("%f\n",3*pi);
    printf("%f\n",3*PI);
}
