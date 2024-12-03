#include<iostream>
using namespace std;
int count = 0;
struct Node{
	int data;
	Node *next;
	Node *prev;
};Node *head,*mid = NULL;
void push(int dat){
	Node *newnode = new Node;
	newnode->data = dat;
	newnode->prev = NULL;
	newnode->next = head;
	
	if(head!=NULL){
		head->prev = newnode;
	}
	head = newnode;
	count++;
	if(count == 1){
		mid = head;
	}else if(count % 2 != 0){
		mid = mid->prev;
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
	push(8);
	push(9);
	push(10);
	push(11);
	Node *node = head;
	while(node!=NULL){
		cout<<node->data<<"<-";
		node = node->next;
	}
	cout<<endl;
	cout<<"Middle Element is : "<<mid->data;
}
