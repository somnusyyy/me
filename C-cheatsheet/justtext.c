#include <stdio.h>

int main()
{
  // for (long ans = 1;; ans++)
  // {
  //   if (ans % 5 == 1 && ans % 6 == 5 && ans % 7 == 4 && ans % 11 == 10)
  //   {
  //     printf("%ld\n", ans);
  //     goto END;
  //   }
  // }
  // END:;

  // int find = 0;
  // for (long ans = 1; !find; ans++){
  //   if(ans%5==1&&ans%6==5&&ans%7==4&&ans%11==10){
  //     printf("%ld\n", ans);
  //     find =1;
  //   }
  // }

  int num1,num2;
  for(int i=0; i< 3; i++){
    printf("input num1(%d)",i+1);
    if(num1<=0) continue;
    scanf("%d",&num2);
    for(int j=0;j<3;j++){
      printf("input num2(%d)",j+1);
      scanf("%d",&num2);
      if(num2<=0)  continue;
    }
  }
}




