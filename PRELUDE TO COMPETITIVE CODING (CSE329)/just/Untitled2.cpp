#include<iostream>
using namespace std;
int main(){
	int arr[5][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
	int top = 0,b = 4,l = 0,r = 3;
	for(int i = 0;i<=4;i++){
		for(int j = 0;j<=3;j++){
			cout<<arr[i][j]<<" ";
		}
		cout<<endl;
	}
	
	cout<<endl;
	cout<<"Spiral Matrix : "<<endl;
	cout<<endl;
	while(top<=b && l<=r){
	for(int i = l;i<=r;i++){
		cout<<arr[top][i]<<" ";
	}
	top++;
	for(int i = top;i<= b;i++){
		cout<<arr[i][r]<<" ";
	}
	r--;
	if(top<=b){
	for(int i=r;i>=l;i--){
		cout<<arr[b][i]<<" ";
	}
	b--;
}
	if(l<=r){
	for(int i = b;i>=top;i--){
		cout<<arr[i][l]<<" ";
	}
	l++;
}
}
}
