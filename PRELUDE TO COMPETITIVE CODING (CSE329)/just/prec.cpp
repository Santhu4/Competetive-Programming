#include<iostream>
using namespace std;
struct Node{
	int data;
	Node *next;
	Node *prev;
};
Node *head = NULL;
Node *mid = NULL;
int count = 0;
void push(int dat){
	Node *newnode = new Node;
	newnode->data = dat;
	newnode->next = head;
	newnode->prev = NULL;
	if(head!= NULL){
		head = head->prev;
	}
	count++;
	if(count == 1){
		mid = head;
	}else if(count %2!= 0){
		mid = mid->prev;
	}
}
int maint(){
	push(1);
	push(2);
	push(3);
	push(4);
	push(5);
	push(6);
	push(7);
	push(8);
	cout<<mid->data;
}
