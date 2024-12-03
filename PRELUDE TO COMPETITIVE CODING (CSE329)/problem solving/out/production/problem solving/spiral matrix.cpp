#include<iostream>
using namespace std;
int main(){
	int n = 5,m = 3;
	int arr[3][5] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
	int t = 0,b = m-1,l = 0,r = n-1;
//	for(int i = 0;i<m;i++){
//		for(int j = 0;j<n;j++){
//			cin>>arr[i][j];
//		}
//		cout<<endl;
//	}
	cout<<"Spiral matrix : ";
	for(int i = 0;i<=0;i++){
		for(int j = 0;j<=r;j++)
		
		cout<<arr[i][j]<<" ";
	}
	t++;
	for(int i = t;i<=b;i++){
		for(int j = r;j<=r;j++){
			cout<<arr[i][j]<<" ";
		}
	}
	b--;
}
