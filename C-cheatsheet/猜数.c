#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
    srand(time(NULL));
    int ans=rand()%100+1;
    //只用rand函数只会造成伪随机数
    int cnt,i; 
    for(i=0;i<10;i++){
        int ret=scanf("%d",&cnt);
        //若键入非数字，则会一直读取，判断直到i=10
        //原因是scanf按指定格式读取输入缓冲区中的内容，若读取失败则内容并不会取走，因而不断循环直到循环执行条件终止
        //可以通过判断scanf函数的返回值（返回值为cnt，cnt表示成功运行的次数）来防止warning的发生
        /**
         * ret= scanf("%d",&cnt);
         **/
        /**
        if(ret!=1){     //注意正确返回的是1
            printf("Input Error!\n");
            return 0;
        }
        **/
        while(ret!=1){
            while (getchar()!='\n');//读走缓冲区中的所有数据,直到遇到换行符
            printf("Input Error,Pleses input a number.");
            ret=scanf("%d",&cnt);
        }
        if(cnt==ans){
            printf("congregation\n");
            break;
        }
        else if(cnt<ans) printf("too small\n");
        else printf("too big\n");
    }
    if(i==10)
        printf("fail\n");

}