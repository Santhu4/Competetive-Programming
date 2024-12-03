#include<iostream>
using namespace std;
struct Node{
	int data;
	Node *next;
};
Node *head = NULL;
void push(int dat){
	Node *newnode = new Node;
	newnode->data = dat;
	newnode->next = head;
	head = newnode;
}
int pop(){
	Node *temp = head;
	int value = head->data;
	head = head->next;
	delete temp;
	return value;
}
void display(){
	Node *node = head;
	while(node!=NULL){
		cout<<node->data<<" ";
		node = node->next;
	}
}
int main(){
	push(23);
	push(42);
	push(56);
	push(33);
	cout<<"Popped Element is : "<<pop()<<endl;
	display();
}
