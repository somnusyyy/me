#include <stdio.h>
#include <stdlib.h>
#include <tchar.h>

typedef struct Node{
    int data;
    struct Node * next;
}NODE,*PNODE;

typedef PNODE List;
typedef PNODE Position;

int is_empty(List pHead);               //�ж������Ƿ�Ϊ��
int is_last(Position p, List pHead);       //�жϵ�ǰλ���Ƿ�Ϊĩβ
List create_list();                     //������ͷ��㵥��������ͷָ��
Position find(int x, List pHead);          //��������
Position find_previous(int x, List pHead); //����x��ǰ��
void delete_node(int x, List pHead);    //����ɾ������
void insert(int x, List pHead, Position p);//��������
void delete_list(List pHead);           //�������

int is_empty(List pHead){
    return pHead->next==NULL;
}

int is_last(Position p,List pHead){
    return p->next==NULL;
}


List create_list(){
    int val;
    List pHead=(List)malloc(sizeof(NODE));
    Position pCurrent=pHead;
    pCurrent->next=NULL;
    if(NULL==pHead){
        printf("pHead malloc failed\n");
        exit(-1);
    }
    printf("Input the data(-1 to exit):");
    while(1){
        scanf("%d",&val);
        if(val==-1) break;
        List pNew=(List)malloc(sizeof(NODE));
        pNew->data=val;
        pNew->next=pCurrent->next;
        pCurrent->next=pNew;
        pCurrent=pNew;

    }

    return pHead;

}

Position find(int x, List pHead){
    Position p;
    p=pHead->next;
    while(p->next!=NULL&&p->data!=x){
        p=p->next;
    }
    return p;
}

Position find_previous(int x, List pHead)
{
    Position p;
    p=pHead->next;
    while(p->next!=NULL&&p->data!=x)
        p=p->next;
    return p;
}

void delete_node(int x, List pHead){
    Position p,temp;
    p=find_previous(x,pHead);
    if(!is_last(p,pHead)){
        temp=p->next;
        p->next=temp->next;
        free(temp);
    }
}

void insert(int x, List pHead, Position p){
    Position temp;
    temp=(List)malloc(sizeof(NODE));
    if(NULL==temp) printf("temp malloc failed.");
    temp->data=x;
    temp->next=p->next;
    p->next=temp;
}

void delete_list(List pHead){
    Position p,temp;
    p=pHead->next;
    pHead->next=NULL;  //ȥ��ͷ���
    while(p!=NULL){
        temp=p->next;
        free(p);
        p=temp;
    }

}

void print_list(List pHead)
{
	Position p = pHead->next;

	while (NULL != p)
	{
		printf("%d\n", p->data);
		p = p->next;
	}
}

int main()
{
    int x;
    List pHead,p;
    //��������
	pHead = create_list();
	print_list(pHead);

	//��������
	printf("Input want find data:\n");
	scanf("%d", &x);
	p = find(x, pHead);
	printf("%d\n", p->data);

	//��������
	printf("Input want insert data:\n");
	scanf("%d", &x);
	insert(x, pHead, p);
	print_list(pHead);

	//����ɾ��
	printf("Input want delete data:\n");
	scanf("%d", &x);
	delete_node(x, pHead);
	print_list(pHead);

	//�������
	delete_list(pHead);

    return 0;
}
