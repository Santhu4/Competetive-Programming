#include<iostream>
using namespace std;
int arr[5];
int n = 5;
void push1(int num){
	int top1 = 0;
	if(top1>=(n/2)){
		cout<<"Over flow";
	}else{
		arr[top1] = num;
		top1++;
	}
}
void push2(int num){
	int top2;
		top2 = (n/2);
	if(top2>=n){
		cout<<"Over flow";
	}else{
		arr[top2] = num;
		top2++;
	}
}
//void pop1(){
//	
//}
//void pop2(){
//	
//}
int main(){
	int n = 5;
	push1(1);
	push2(2);
	push1(3);
//	cout<<pop1();
	push2(4);
//	pop2();
//	push(5);
//	push(6);
for(int i = 0;i<n;i++){
	cout<<arr[i]<<" ";
}
}
