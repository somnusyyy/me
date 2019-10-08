#include <stdio.h>
#include <stdlib.h>

typedef int ElementType;

typedef struct QueueRecord{
    int Capcity;
    int Size;
    int Front;
    int Rear;
    ElementType *Array;
}*Queue;

int IsEmpty(Queue Q);					//判断队列是否为空
int IsFull(Queue Q);					//判断队列是否已满
Queue CreateQueue(int MaxElements);		//创建队列
void DisposeQueue(Queue Q);				//销毁队列
void MakeEmpty(Queue Q);				//清空队列
void Enqueue(ElementType X, Queue Q);	//入队
ElementType Dequeue(Queue Q);					//出队

int IsEmpty(Queue Q){
    return Q->Front==NULL;
}

int IsFull(Queue Q){
    return Q->Size==Q->Capcity;
}

Queue CreateQueue(int MaxElements){
    Queue Q=(Queue)malloc(sizeof(struct QueueRecord));
    if(NULL==Q){
        printf("out of space!\n");
        exit(-1);
    }
    Q->Array=(Queue)malloc(sizeof(ElementType)*MaxElements);
    if(NULL==Q->Array){
        printf("out of space!\n");
        exit(-1);
    }
    MakeEmpty(Q);
    Q->Capcity=MaxElements;
    return Q;
}

void DisposeQueue(Queue Q){
    free(Q->Array);
    free(Q);
}

void MakeEmpty(Queue Q){
    Q->Size=0;
    Q->Front=0;
    Q->Rear=-1;
}

void Enqueue(ElementType X,Queue Q){
    if(IsFull(Q)){
        printf("The queue is full!\n");
        exit(-1);
    }
    else{
        Q->Size++;
        if(Q->Rear==Q->Capcity-1){
            Q->Rear=0;
        }
        else Q->Rear++;
        Q->Array[Q->Rear]=X;
    }
}

ElementType Dequeue(Queue Q){
    Q->Size--;
    ElementType temp;
    temp=Q->Array[Q->Front];
    if(Q->Front==Q->Capcity-1){
            Q->Front=0;
    }
    else Q->Front++;
    return temp;
}

//int main()
//{
//    Queue Q=NULL;
//    Q=CreateQueue(5);
//    Enqueue(3,Q);
//    Enqueue(5,Q);
//    Enqueue(7,Q);
//    Enqueue(10,Q);
//    Enqueue(11,Q);
//    printf("%d %d",Dequeue(Q),Dequeue(Q));
//    return 0;
//}
