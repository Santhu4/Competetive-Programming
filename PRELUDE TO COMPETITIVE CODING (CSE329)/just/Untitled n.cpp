#include<iostream>
using namespace std;
int arr[5];
int top1,top2,n;
void push1(int val){
	if(top1>top2){
		cout<<"overflow";
	}
		arr[top1] = val;
				top1++;
}
void push2(int val){
	if(top2<top1){
		cout<<"overflow";
	}else{
		arr[top2] = val;
				top2--;
	}
}
int pop1(){
	if(top1 == 0){
		cout<<"Underflow";
	}else{
		top1--;
		return arr[top1];
	}
}
int pop2(){
	if(top2 == n-1){
		cout<<"Underflow";
	}else{
		top2++;
		return arr[top1];
	}
}
int main(){
	n = 5;
	top1 = 0;
	top2 = n-1;
	push1(1);
	push1(2);
	push2(3);
	push2(10);
	push1(4);
	for(int i = 0;i<n;i++){
		cout<<arr[i]<<" ";
	}
	
}
