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
void push(int dat)
{
	Node *newnode = new Node;
	newnode->data = dat;
	newnode->next = head;
	newnode->prev = NULL;
	if(head != NULL){
		head->prev = newnode;
	}
	head = newnode;
	count++;
	if(count == 1){
		mid = head;
	}else if(count %2 != 0){
		mid =  mid->prev;
	}
}
int pop(){
	if(mid==NULL){
		cout<<"Stack is Empty";
	}
	count--;
	int value = head->data;
		Node *temp = head;
		head = head->next;
		head->prev = NULL;
		delete temp;
	if(count%2 == 0){
		mid = mid->next;
	}
	return value;
}
void print(){
	Node *cur = head;
	Node *prev = NULL;
	while(cur!=NULL){
		prev = cur;
		cur = cur->next;
	}
	while(cur!= NULL){
		cout<<cur->data<<"->";
		cur = cur->prev;
	}
}
int main(){
	push(1);
	push(2);
	push(3);
	push(4);
	push(5);
	push(6);
	push(7);
	cout<<"Popped element is : "<<pop()<<endl;
	cout<<"Popped element is : "<<pop()<<endl;
	cout<<"Mid Element : "<<mid->data<<endl;
}
