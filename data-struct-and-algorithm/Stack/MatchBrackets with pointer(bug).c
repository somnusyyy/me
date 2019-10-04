#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef char ElementType;

typedef struct Node{
    ElementType Element;
    struct Node * Next;
}NODE,*PNODE;
typedef PNODE stack;

int isEmpty(stack S){
    return S->Next==NULL;
}


stack createStack(void){
    stack S;
    S=(stack)malloc(sizeof(NODE));
    if(NULL!=S){
        S->Next=NULL;
    }
    return S;
}

ElementType top(stack S){
//    if(isEmpty(S)){
////        printf("it works.\n");
//        return;
//    }
    ElementType temp;
    S=S->Next;
    temp=S->Element;
    return temp;
}

void pop(stack S)
{
	if(isEmpty(S))
	{
		perror("Stack is empty");
		return 0;
	}
	PNODE P;
	P = S->Next;
	S->Next = P->Next;
	free(P);
}

void push(ElementType x,stack S){
    stack temp;
    temp=(stack)malloc(sizeof(NODE));
    if(NULL==temp){
        printf("Not Enough memory.\n");
        return;
    }
    temp->Element=x;
    temp->Next=S->Next;
    S->Next=temp;

}

int match(char str,char temp){
    if((str=='('&&temp==')')||(str=='['&&temp==']')||(str=='{'&&temp=='}'))
        return 1;
    else return 0;
}

int main()
{
    int count=0;
    stack S;
    S=(stack)malloc(sizeof(NODE));
    if(NULL==S) printf("out of space.\n");
    S->Next=NULL;
    char str[100];
    scanf("%s",str);
    for(int i=0;i<strlen(str);i++){
        if(str[i]=='('||str[i]=='['||str[i]=='{')
            push(str[i],S);
        else {
//            if(isEmpty(S)){
//                printf("fail.\n");
//                return;
//            }
            char temp=top(S);
//            printf("%c %d\n",temp,match(str[i],temp));

            if(match(temp,str[i])){
                count++;
//                printf("%c,%c\n",temp,str[i]);
                pop(S);
            }


        }
    }
//    printf("%d\n",isEmpty(S));
    if(count==strlen(str)/2&&strlen(str)%2==0) printf("success.\n");
    else printf("fail.\n");
    return 0;
}
