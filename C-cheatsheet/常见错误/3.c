#include <stdio.h>

int func(int *p){ return (*p-- = 3) - 1;//(*p-- = 3)可以拆成两步,*p=3; p--;
                                        //*p是指针调用函数时指向arr[1]=7
                                        //*p=3，另p指向的数据为3，arr[1]=3
                                        //p--，此时p为10
}
int main(){
     int arr[]={10,7,5}; 
     
     int *p = arr + 1; //p=7
     printf("%d\n",func(p)+*p);
      }    


    //printf("%d\n", *p1);
    // p1+=*p2++;
    //int *p2=p1++;

    //printf("%d %d\n",*p1,*p2);