#include <stdio.h>
#include <stdlib.h>


typedef struct Node{
    int coefficient;     //系数
    int exponent;       //指数
    struct Node * next;
}Polynomial,*PtrPolynomial;

typedef PtrPolynomial List;
typedef PtrPolynomial Position;

List creat_polynomial(){
    int Coefficient,Exponent;
    List pHead=(List)malloc(sizeof(Polynomial));
    Position pCurrent=pHead;
    pCurrent->next=NULL;
    if(NULL==pHead){
        printf("pHead malloc failed.\n");
        exit(-1);
    }
    while(1){
        printf("input the coefficient and the exponent.\n");
        scanf("%d%d",&Coefficient,&Exponent);
        if(Coefficient==-1||Exponent==-1){
            break;
        }
        List pNew=(List)malloc(sizeof(Polynomial));
        pNew->coefficient=Coefficient;
        pNew->exponent=Exponent;
        pNew->next=pCurrent->next;
        pCurrent->next=pNew;
        pCurrent=pNew;
    }
    return pHead;

}
void sort_cofficient(List Phead){
    Position p,q;
    for(p=Phead->next;p!=NULL;p=p->next){
        for(q=p->next;q!=NULL;q=q->next){
            if(p->exponent<q->exponent){
                int temp;
                //exchange the coefficient
                temp=p->coefficient;
                p->coefficient=q->coefficient;
                q->coefficient=temp;

                //exchange the exponent
                temp=p->exponent;
                p->exponent=q->exponent;
                q->exponent=temp;
            }
        }
    }
    return;
}

List add_polynomial(List p1,List p2,List p3){
    List pCurrent1=p1->next,pCurrent2=p2->next,pCurrent=p3;
    while(NULL!=pCurrent1&&NULL!=pCurrent2){
        Position temp;

        if(pCurrent1->exponent > pCurrent2->exponent){

            temp=pCurrent1->next;
            pCurrent1->next=pCurrent->next;
            pCurrent->next=pCurrent1;
//            free(pCurrent1);
            pCurrent1=temp;
        }

        else if(pCurrent1->exponent < pCurrent2->exponent){

            temp=pCurrent2->next;
            pCurrent2->next=pCurrent->next;
            pCurrent->next=pCurrent2;
//            free(pCurrent2);         //尽量减少free操作以免造成错误
            pCurrent2=temp;
        }
        else{
            int sum=pCurrent1->coefficient+pCurrent2->coefficient;

            if(sum!=0){
                temp=pCurrent1->next;
                pCurrent1->coefficient=sum;
                pCurrent1->next=pCurrent->next;
                pCurrent->next=pCurrent1;
//                free(pCurrent1);
                pCurrent1=temp;

                temp=pCurrent2->next;
                free(pCurrent2);
                pCurrent2=temp;
            }
            else{
                temp=pCurrent1;
                pCurrent1=pCurrent1->next;
                free(temp);

                temp=pCurrent2;
                pCurrent2=pCurrent2->next;
                free(temp);
            }
        }
        pCurrent=pCurrent->next;
    }
    while(NULL!=pCurrent1){
        Position temp;
        temp=pCurrent1->next;
        pCurrent1->next=pCurrent->next;
        pCurrent->next=pCurrent1;
        pCurrent1=temp;
    }
    while(NULL!=pCurrent2){
        Position temp;
        temp=pCurrent2->next;
        pCurrent2->next=pCurrent->next;
        pCurrent->next=pCurrent2;
        pCurrent2=temp;
    }

    return p3;

}

List mulit_Polynomial(List p1,List p2,List p3){
    List pCurrent1=p1->next,pCurrent2=p2->next,pCurrent=p3,pHead2=p2->next;
    while(NULL!=pCurrent1){

        while(NULL!=pCurrent2){
            Position temp=(Position)malloc(sizeof(Polynomial));
            temp->coefficient=(pCurrent1->coefficient)*(pCurrent2->coefficient);
            temp->exponent=pCurrent1->exponent+pCurrent2->exponent;
//            temp->next=pCurrent->next;
            pCurrent2=pCurrent2->next;
            pCurrent->next=temp;
            pCurrent=pCurrent->next;


        }
        pCurrent2=pHead2;
        pCurrent1=pCurrent1->next;
    }
    return p3;
}

int main()
{
    PtrPolynomial p1, p2, p3;
	p3 = (PtrPolynomial)malloc(sizeof(Polynomial));
	p3->next = NULL;

	//创建多项式
	printf("创建第一个多项式\n");
    p1 =creat_polynomial();
	printf("创建第二个多项式\n");
	p2 = creat_polynomial();

	//多项式排序
	sort_cofficient(p1);
	sort_cofficient(p2);

//	printf("多项式加法\n");
//	PtrPolynomial result= add_polynomial(p1, p2, p3), show=result->next;
//	printf("%dX^%d", show->coefficient, show->exponent);
//	show=show->next;
//	while (NULL != show)
//	{
//		printf("+%dX^%d", show->coefficient, show->exponent);
//		show = show->next;
//	}
//	printf("\n");

    printf("多项式乘法\n");
	PtrPolynomial result= mulit_Polynomial(p1, p2, p3), show=result->next;
	printf("%dX^%d", show->coefficient, show->exponent);
	show=show->next;
	while (NULL != show)
	{
		printf("+%dX^%d", show->coefficient, show->exponent);
		show = show->next;
	}
	printf("\n");
    return 0;
}
