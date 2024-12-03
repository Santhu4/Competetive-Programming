#include<iostream>
using namespace std;
int arr[8];
int top1,n,top2;
void push1(int n){
	if(top1>top2){
		cout<<"Stack 1 Overflow"<<top1<<" "<<top2<<endl;
	}
	arr[top1] = n;
	top1++;
}
void push2(int n){
	if(top2<top1){
		cout<<"Stack 2 overflow"<<endl;
	}
	arr[top2] = n;
	top2--;
	
}
int pop1(){
	if(top1 == 0){
		cout<<" Stack Underflow"<<endl;
	}
	top1--;
	return arr[top1];
}
int pop2(){
	if(top2 == n-1){
		cout<<"Stack Underflow"<<endl;
	}
	top2++;
	return arr[top2];
}
int main(){
	n = sizeof(arr)/sizeof(arr[0]);
	top1 = 0;
	top2 = n-1;
	push1(23);
	push2(30);
	push1(42);
	push1(4);
	push1(44);
	push1(45);
	push2(36);
		for(int i = 0 ;i<n;i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	pop1();
	pop2();
		for(int i = 0 ;i<n;i++){
		cout<<arr[i]<<" ";
	}
}
