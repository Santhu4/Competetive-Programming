#include<iostream>
using namespace std;
int main(){
	int arr[] = {2,2,2,0,0,0,1,1,1};
	int n = sizeof(arr)/sizeof(arr[0]);
	int l = 0,r = n-1,m = 0;
	while(m<=r){
		if(arr[m]==2){
			int temp =arr[r];
			arr[r] = arr[m];
			arr[m] = temp;
			r--;
		}else if(arr[m] ==0){
			int temp =arr[l];
			arr[l] = arr[m];
			arr[m] = temp;	
			m++;
			l++;		
		}else{
			m++;
		}
	}
	for(int i =0;i<n;i++){
		cout<<arr[i]<<" ";
	}
}
