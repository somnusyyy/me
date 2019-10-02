#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int capcity;
    int topOFStack;
    int *array;
}*Stack;

void dispose_stack(Stack S);
int is_empty(Stack S);
void make_empty(Stack S);
int is_full(Stack S);
Stack create_statck(int maxElements);
Stack create_mstatck(int maxElements);
void push(int x, Stack S);
int top(Stack S);
void pop(Stack S);
int top_and_pop(Stack S);

void dispose_stack(Stack S){
    if(NULL!=S){
        free(S->array);
        free(S);
    }
}

int is_empty(Stack S){
    return S->topOFStack==-1;
}

void make_empty(Stack S){
    S->topOFStack==-1;
}

int is_full(Stack S){
    return S->topOFStack==S->capcity-1;
}

Stack create_statck(int maxElements){
    Stack S;
    S=(Stack)malloc(sizeof(Node));
    if(NULL==S){
        print("out of space\n");
        return;
    }
    S->array=(int*)malloc(sizeof(int)*maxElements);
    if(NULL==S->array){
        print("out of space\n");
        return;
    }
    S->capcity=maxElements;
    make_empty(S);

    return S;
}

void push(int x, Stack S)
{
    if(is_full(S)){
        printf("FULL STACK");
        return;
    }
    else
        S->array[++S->topOFStack]=x;
}

int top(Stack S){
    if(!is_empty(S)){
        return S->array[S->topOFStack];
    }
    printf("Empty Stack\n");
    return 0;
}

void pop(Stack S){
    if(is_empty(S))
        printf("Empty Stack");
    else S->topOFStack--;
}

int top_and_pop(Stack S){
    if(!is_empty(S)){
        return S->array[S->topOFStack--];
    }
    printf("Empty Stack\n");
    return 0;
}
