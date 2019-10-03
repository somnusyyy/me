#include <stdio.h>
#include <stdlib.h>


typedef struct Node{
    int Element;
    struct Node * Next;
}NODE,*PNODE;
typedef PNODE stack;
typedef int ElementType;


int isEmpty(stack S);
stack createStack(void);
void disposeStack(stack S);
void makeEmpty(stack S);
void push(ElementType x,stack S);
ElementType pop(stack S);



int isEmpty(stack S){
    return S->Next==NULL;
}

stack createStack(void){
    stack S;
    S=(stack)malloc(sizeof(NODE));
    if(S!=NULL){
        S->Next=NULL;
    }
    return S;
}

void disposeStack(stack S){     
    while(!isEmpty(S)){
        pop(S);
    }
}

void makeEmpty(stack S){
    if(S!=NULL){
        while(!isEmpty(S)){
            pop(S);
        }
    }
}

void push(ElementType x,stack S){
    stack temp;
    temp=(stack)malloc(sizeof(struct Node));
    if(NULL==temp){
        printf("Not Enough memory\n");
        return;
    }
    temp->Element=x;
    temp->Next=S->Next;
    S->Next=temp;
}

ElementType pop(stack S){
    if(isEmpty(S)){
        printf("Stack is empty\n");
        return;
    }
    PNODE P;
    ElementType temp;
    P=S->Next;
    temp=p->Element;
    S->Next=P->Next;
    free(P);
    return temp;
}
